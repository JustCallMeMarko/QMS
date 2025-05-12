/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qms.QMS;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author canti
 */
public class Database {
    private static final String DB_URL = "jdbc:sqlite:QMS.db";
   public static void createUsersTable() {
        String sql = """
            CREATE TABLE IF NOT EXISTS users (
                username TEXT PRIMARY KEY,
                score INTEGER NOT NULL,
                mode TEXT NOT NULL
            );
            """;
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertOrUpdateUser(String username, int score, String mode) {
        String sql = """
            INSERT INTO users (username, score, mode)
            VALUES (?, ?, ?)
            ON CONFLICT(username) DO UPDATE SET score = excluded.score;
            """;
        System.out.println("updated");
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setInt(2, score);
            pstmt.setString(3, mode);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> getLeaderboardByMode(String mode) {
        List<String[]> leaderboard = new ArrayList<>();
        String sql = "SELECT username, score FROM users WHERE mode = ? ORDER BY score DESC";

        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, mode);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String username = rs.getString("username");
                int score = rs.getInt("score");
                leaderboard.add(new String[] { username, String.valueOf(score) });
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return leaderboard;
    }


}

