/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edmond.jobbank.mavenproject1;

import java.io.*;
import java.sql.Connection;
import org.apache.ibatis.jdbc.ScriptRunner;

/**
 *
 * @author Brian
 */
public class Intro extends javax.swing.JFrame {
    
    private static Intro introPanel;
    static Connection conn = Database.getConnectionToDB();
    static ScriptRunner sr = new ScriptRunner(conn);
    /**
     * Creates new form Intro
     */
    private Intro() {
        initComponents();
    }
    
    public static Intro getInstance(){
        if(introPanel == null) {
            introPanel = new Intro();
            createTables();
            populateTables();
        }
        return introPanel;
    }
    
    private static void createTables() {
        try {
            sr.runScript(new BufferedReader(new FileReader("C:\\Users\\Edmond\\Documents\\Workspace\\cps510\\jobbankuimaven\\scripts\\CreateTables.sql")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private static void dropTables() {
       try {
            sr.runScript(new BufferedReader(new FileReader("C:\\Users\\Edmond\\Documents\\Workspace\\cps510\\jobbankuimaven\\scripts\\DropTables.sql")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    }
    
    private static void populateTables() {
        try {
            sr.runScript(new BufferedReader(new FileReader("C:\\Users\\Edmond\\Documents\\Workspace\\cps510\\jobbankuimaven\\scripts\\PopulateTables.sql")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Intro_jpanel = new javax.swing.JPanel();
        NewUser_Button = new javax.swing.JButton();
        ReturningUser_Button = new javax.swing.JButton();
        Close_Button = new javax.swing.JButton();
        Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NewUser_Button.setText("New User");
        NewUser_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUser_ButtonActionPerformed(evt);
            }
        });

        ReturningUser_Button.setText("Returning User");
        ReturningUser_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturningUser_ButtonActionPerformed(evt);
            }
        });

        Close_Button.setText("Close");
        Close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_ButtonActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Welcome to Job Bank");

        javax.swing.GroupLayout Intro_jpanelLayout = new javax.swing.GroupLayout(Intro_jpanel);
        Intro_jpanel.setLayout(Intro_jpanelLayout);
        Intro_jpanelLayout.setHorizontalGroup(
            Intro_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Intro_jpanelLayout.createSequentialGroup()
                .addGroup(Intro_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Intro_jpanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Intro_jpanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(NewUser_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(ReturningUser_Button))
                    .addComponent(Close_Button))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        Intro_jpanelLayout.setVerticalGroup(
            Intro_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Intro_jpanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(Intro_jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewUser_Button)
                    .addComponent(ReturningUser_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(Close_Button))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Intro_jpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Intro_jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewUser_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUser_ButtonActionPerformed
        newUserPanel newPanel = newUserPanel.getInstance(this,conn);
        newPanel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NewUser_ButtonActionPerformed

    private void ReturningUser_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturningUser_ButtonActionPerformed
        Returning returnUserPanel = Returning.getInstance(this,conn);
        returnUserPanel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReturningUser_ButtonActionPerformed

    private void Close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_ButtonActionPerformed
        dropTables();
        System.exit(0);
    }//GEN-LAST:event_Close_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close_Button;
    private javax.swing.JPanel Intro_jpanel;
    private javax.swing.JButton NewUser_Button;
    private javax.swing.JButton ReturningUser_Button;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
