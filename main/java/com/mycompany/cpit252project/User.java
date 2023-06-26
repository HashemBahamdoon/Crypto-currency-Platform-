/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252project;

/**
 *
 * @author yaaz4
 */
public class User {
   String UserName;
String Password;

    public User() {
    }

    public User(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }


}
