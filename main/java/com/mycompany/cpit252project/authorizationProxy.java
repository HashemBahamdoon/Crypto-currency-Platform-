/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252project;

/**
 *
 * @author yaaz4
 */
public class authorizationProxy implements Authorization{
     String authorizationCode = "123";
    String userEnteredCode ="";

    private Authorization ta = new TradingAuthorization();

    public authorizationProxy() {
    }
       
    public authorizationProxy(String userEnteredCode) {
        this.userEnteredCode = userEnteredCode;
        
    }

    @Override
    public void tradingAccess() {
        if (userEnteredCode.equalsIgnoreCase(authorizationCode)) {
         ta.tradingAccess();
        }else{

            System.out.println("sorry failed access");
                System.exit(0);
        }
    }

}