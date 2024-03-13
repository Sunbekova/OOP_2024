/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.system;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author suanb
 */
public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");    
    
    WelcomePage(String userId){
        
        welcomeLabel.setBounds(0, 0, 200,35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setText("Hello " + userId);
        
        
        
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(420, 420);
        frame.setLayout(null);
	frame.setVisible(true);
    }
}
