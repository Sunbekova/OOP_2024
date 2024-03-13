/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.system;


import java.util.HashMap;

/**
 *
 * @author suanb
 */
public class IDandPasswords {
    
    HashMap<String, String> logininfo = new HashMap<String, String>();
    IDandPasswords(){
        logininfo.put("Bro", "pizza");
        logininfo.put("Kchau", "Password");
        logininfo.put("QwQ", "UwU123");
   
    }
    
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
