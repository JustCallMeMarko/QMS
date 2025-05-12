/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qms.QMS;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author minsey
 * 
 */
public class QuizIdentify extends javax.swing.JFrame {
    private boolean isHard;
    private int counter;
    public String[][] identification;
    /**
     * Creates new form QuizIdentify
     */
    public void setupQuestions() {
        if (isHard) {
            identification = new String[][]{
            {
                "Identify the specific Java feature that allows a class to have methods with the same name but different parameter lists (types and/or number).",
                "Method Overloading"
            },
            {
                "Identify the keyword in Java used to explicitly invoke a superclass constructor from a subclass constructor.",
                "super"
            },
            {
                "Identify the interface in Java's Collections Framework that represents an ordered sequence of elements and allows duplicate elements.",
                "List"
            },
            {
                "Identify the specific type of exception in Java that signals errors that are typically unrecoverable and often indicate serious problems within the Java Virtual Machine.",
                "VirtualMachineError"
            },
            {
                "Identify the design pattern that involves a single class responsible for creating objects while hiding the creation logic from the client.",
                "Factory Pattern"
            },
            {
                "Identify the Java annotation used to indicate that a method in a subclass is intended to override a method with the same signature in its superclass.",
                "@Override"
            },
            {
                "Identify the Java feature introduced in version 8 that allows adding new methods to interfaces without breaking existing implementations by providing default implementations.",
                "Default Methods (in Interfaces)"
            },
            {
                "Identify the specific type of inner class in Java that is declared without a name and is defined and instantiated in a single statement, often used for implementing event listeners.",
                "Anonymous Inner Class"
            },
            {
                "Identify the Java API that provides classes for performing asynchronous operations and managing threads in a more high-level way than using the Thread class directly.",
                "Concurrency Utilities (java.util.concurrent package)"
            },
            {
                "Identify the principle of object-oriented programming that focuses on bundling data (attributes) and the methods that operate on that data within a single unit (a class).",
                "Encapsulation"
            }
        };

        }else{
            identification = new String[][]{
            {
                "Identify the programming construct that allows a block of code to be executed repeatedly based on a specified condition.",
                "Loop"
            },
            {
                "Identify the process of converting source code written in a high-level programming language into machine code that a computer can directly execute.",
                "Compilation"
            },
            {
                "Identify the type of programming error that occurs when the syntax of the code violates the rules of the programming language.",
                "Syntax Error"
            },
            {
                "Identify the fundamental programming concept where a named storage location in memory holds a value.",
                "Variable"
            },
            {
                "Identify the programming paradigm that focuses on organizing code around \"objects\" which can contain data, in the form of fields (often known as attributes or properties), and code, in the form of procedures (often known as methods).",
                "Object-Oriented Programming (OOP)"
            }
        };

        }
    }
    private void refreshQuestionUI() {
        if (counter < identification.length) {
            Question.setText("<html>Question : " + identification[counter][0] + "</html>");
            Text.setText("");
            Score.setText("Score: " + User.getScore());
        } else{
            // Quiz is over
            Question.setText("Quiz completed!");
            NextBtn.setEnabled(true);
        }
    }
     public boolean isIsHard() {
        return isHard;
    }

    public void setIsEasy(boolean isHard) {
        this.isHard = isHard;
    }
    public QuizIdentify(boolean isHard) {
        this.isHard = isHard;
        setupQuestions();
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Score = new javax.swing.JLabel();
        NextBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Question = new javax.swing.JLabel();
        Text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 51, 56));

        jPanel2.setBackground(new java.awt.Color(49, 51, 56));

        Score.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setText("Score: "+ User.getScore());

        NextBtn.setBackground(new java.awt.Color(51, 255, 51));
        NextBtn.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        NextBtn.setForeground(new java.awt.Color(0, 0, 0));
        NextBtn.setText("Next");
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(49, 51, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Your Answer");

        Question.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Question.setForeground(new java.awt.Color(255, 255, 255));
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Question.setText("<html>Question : " + identification[counter][0]+"</html>");

        Text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(NextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBtnActionPerformed
        if(counter < identification.length){
                if(!Text.getText().trim().isEmpty()){
                    if (Text.getText().equalsIgnoreCase(identification[counter][1])) {
                        User.setScore(User.getScore() + 1);
                    }
                    counter++;
                    refreshQuestionUI();
                }
        }else if(counter == identification.length ){
            NextBtn.setText("Show Leaderboards");
        }
        if(counter == identification.length ){
            Database.insertOrUpdateUser(User.getName(), User.getScore(), User.getMode());
            Leaderboard lb = new Leaderboard();
            lb.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_NextBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NextBtn;
    private javax.swing.JLabel Question;
    private javax.swing.JLabel Score;
    private javax.swing.JTextField Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
