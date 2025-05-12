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
public class QuizEasyMedium extends javax.swing.JFrame {
    String[][] questionArray;
    private boolean isEasy;
    private int counter = 0;
    private String selected;
    private boolean isSelected = false;
    public void setupQuestions() {
        if (isEasy) {
            questionArray = new String[][] {
                {
                    "Which of the following is a programming language?",
                    "Banana", "Python", "Eagle", "Rocket",
                    "B"
                },
                {
                    "What does a “bug” in programming refer to?",
                    "An insect in your computer", "A broken mouse", "An error or flaw in the code", "A slow computer",
                    "C"
                },
                {
                    "Who invented the Java programming language?",
                    "Dennis Ritchie", "Bjarne Stroustrup", "James Gosling", "Guido van Rossum",
                    "C"
                },
                {
                    "Which data type is used to store true or false values in most languages?",
                    "Integer", "String", "Boolean", "Float",
                    "C"
                },
                {
                    "In which language is the keyword System.out.println() used to display output?",
                    "C++", "Java", "Python", "JavaScript",
                    "B"
                },
                {
                    "What does HTML stand for?",
                    "Hyper Trainer Marking Language", "Hyper Text Markup Language", "High Text Machine Language", "None of the above",
                    "B"
                },
                {
                    "Which symbol is commonly used to end a statement in Java and C++?",
                    ":", ";", ".", ",",
                    "B"
                },
                {
                    "What does HTML mainly describe?",
                    "How a program runs", "The style of a website", "The structure of a webpage", "A database system",
                    "C"
                },
                {
                    "What is the primary purpose of an algorithm in programming?",
                    "To store data", "To perform operations on data", "To define the program’s structure", "To provide a step-by-step solution to a problem",
                    "D"
                },
                {
                    "Which of the following is an example of a primitive data type?",
                    "Array", "Object", "String", "List",
                    "C"
                }
            };
        } else {
            questionArray = new String[][] {
                {
                    "What is the purpose of the final keyword in Java?",
                    "It prevents inheritance of a class", 
                    "It makes a method final, so it cannot be overridden", 
                    "It defines an immutable variable, method, or class", 
                    "All of the above", 
                    "D"
                },
                {
                    "Which of the following is NOT a valid way to handle exceptions in Java?",
                    "try-catch", 
                    "throws", 
                    "finally", 
                    "return", 
                    "D"
                },
                {
                    "Which method is used to find the length of an array in Java?",
                    "array.length()", 
                    "array.size()", 
                    "array.getLength()", 
                    "array.length", 
                    "D"
                },
                {
                    "What is the default value of an integer array in Java?",
                    "0", 
                    "null", 
                    "undefined", 
                    "1", 
                    "A"
                },
                {
                    "Which of the following methods is used to create a new thread in Java?",
                    "run()", 
                    "newThread()", 
                    "start()", 
                    "execute()", 
                    "C"
                }
            };

        }
    }
    
    private void refreshQuestionUI() {
        if (counter < questionArray.length) {
            Question.setText("<html>Question : " + questionArray[counter][0] + "</html>");
            Btn1.setText(questionArray[counter][1]);
            Btn2.setText(questionArray[counter][2]);
            Btn3.setText(questionArray[counter][3]);
            Btn4.setText(questionArray[counter][4]);
            Btn1.setBackground(Color.white);
            Btn2.setBackground(Color.white);
            Btn3.setBackground(Color.white);
            Btn4.setBackground(Color.white);
            Score.setText("Score: " + User.getScore());
        } else if (!(counter < questionArray.length) && isEasy) {
            // Quiz is over
            Question.setText("Quiz completed!");
            Btn1.setEnabled(false);
            Btn2.setEnabled(false);
            Btn3.setEnabled(false);
            Btn4.setEnabled(false);
            NextBtn.setEnabled(true);
        }
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }
    /**
     * Creates new form QuizEasyMedium
     */
    public QuizEasyMedium(boolean isEasy) {
        this.isEasy = isEasy;
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
        jPanel4 = new javax.swing.JPanel();
        Btn3 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Question = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        NextBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 51, 56));

        jPanel4.setBackground(new java.awt.Color(49, 51, 56));

        Btn3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn3.setText("<html>" + questionArray[0+counter][3] + "</html>");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn2.setText("<html>" + questionArray[0+counter][2] + "</html>");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn4.setText("<html>" + questionArray[0+counter][4] + "</html>");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn1.setText("<html>" + questionArray[0+counter][1] + "</html>");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                    .addComponent(Btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Question.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Question.setForeground(new java.awt.Color(255, 255, 255));
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Question.setText("<html>Question : " + questionArray[0+counter][0]+"</html>");

        Score.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setText(User.getName() + " | Score: "+ User.getScore());

        NextBtn.setBackground(new java.awt.Color(51, 255, 51));
        NextBtn.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        NextBtn.setForeground(new java.awt.Color(0, 0, 0));
        NextBtn.setText("Next");
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(NextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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
        if(counter < questionArray.length){
            if(isSelected){
                if (getSelected().equals(questionArray[counter][5])) {
                   User.setScore(User.getScore() + 1);
               }
               counter++;
               refreshQuestionUI();
               isSelected = false;
           }
        }else if(counter == questionArray.length ){
            NextBtn.setText("Show Leaderboards");
        }
        if(counter == questionArray.length ){
            Database.insertOrUpdateUser(User.getName(), User.getScore(), User.getMode());
            Leaderboard lb = new Leaderboard();
            lb.setVisible(true);
            this.dispose();
        }
        if(!isEasy && counter == questionArray.length){
            QuizIdentify easy = new QuizIdentify(false);
            easy.setVisible(true);
            this.dispose();
        }
            
        
        
    }//GEN-LAST:event_NextBtnActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        setSelected("A");
        isSelected = true;
        Btn1.setBackground(Color.red);
        Btn2.setBackground(Color.white);
        Btn3.setBackground(Color.white);
        Btn4.setBackground(Color.white);
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        setSelected("B");
        isSelected = true;
        Btn1.setBackground(Color.white);
        Btn2.setBackground(Color.red);
        Btn3.setBackground(Color.white);
        Btn4.setBackground(Color.white);
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        setSelected("C");
        isSelected = true;
        Btn1.setBackground(Color.white);
        Btn2.setBackground(Color.white);
        Btn3.setBackground(Color.red);
        Btn4.setBackground(Color.white);
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        setSelected("D");
        isSelected = true;
        Btn1.setBackground(Color.white);
        Btn2.setBackground(Color.white);
        Btn3.setBackground(Color.white);
        Btn4.setBackground(Color.red);
    }//GEN-LAST:event_Btn4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton NextBtn;
    private javax.swing.JLabel Question;
    private javax.swing.JLabel Score;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}