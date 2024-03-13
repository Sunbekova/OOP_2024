/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.system;




import java.util.HashMap;


import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
/**
 *
 * @author suanb
 */
public class LoginPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password:");
    JLabel messegeLabel = new JLabel();
    
   
    
    
    HashMap<String, String> logininfo = new HashMap<String, String>();
    
    LoginPage(HashMap<String, String> loginInfoOriginal){
        logininfo = loginInfoOriginal;
        
        
        userIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        
        messegeLabel.setBounds(125, 250, 250, 35);
        messegeLabel.setFont(new Font(null, Font.ITALIC, 25));
        
        
        userIdField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);
        
        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);
        
        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);
        
        
        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messegeLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);        
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        
        if(event.getSource()==resetButton){
            userIdField.setText("");
            userPasswordField.setText("");
        }
        if(event.getSource()==loginButton){
            String userID = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            
            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(password)){
                    messegeLabel.setForeground(Color.green);
                    messegeLabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                else{
                    messegeLabel.setForeground(Color.red);
                    messegeLabel.setText("Wrong password");

                }
            }
            
            else{
                messegeLabel.setForeground(Color.red);
                messegeLabel.setText("Username not found");

            }
        }
    }
}
