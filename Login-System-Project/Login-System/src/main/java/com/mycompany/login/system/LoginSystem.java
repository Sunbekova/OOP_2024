/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.system;


/**
 *
 * @author suanb
 */
public class LoginSystem {
     public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();
        
        
        
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
        
        
    }
}
