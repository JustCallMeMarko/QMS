/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qms.QMS;

/**
 *
 * @author canti
 */
public class User {
    private static String name = "";
    private static int score = 0;
    private static String mode;
    
    public static String getMode() {
        return mode;
    }

    public static void setMode(String mode) {
        User.mode = mode;
    }
    
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        User.score = score;
    }
    
    
}
