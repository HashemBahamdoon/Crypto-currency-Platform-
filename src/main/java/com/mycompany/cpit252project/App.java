/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252project;


import static java.lang.System.in;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        cryptocurrency crypto = new cryptocurrency();

        BuyCrypto buyCryptoOrder = new BuyCrypto(crypto);

        SellCrypto sellCryptoOrder = new SellCrypto(crypto);

        Broker broker = new Broker();

         Authorization author = null;

       
//------------------------------------------------------
        Scanner in = new Scanner(System.in);
       wallet wallet = null;
        wallet = wallet.getWallet();
        startApp(in,wallet);
        

       int exit =0;
       while (exit != 4)
        {
         
        System.out.println("Choice:  1.Buy 2.Sell 3.view wallet 4.exit ");
        int choice = in.nextInt();
            
        if(choice == 4)
              {
                 break;
              } 

//      if user want to buy
        if (choice == 1) {
              System.out.println("Enter varction Code: hint 123: ");
              String code = in.next();
                author = new authorizationProxy(code);
               author.tradingAccess();
             broker.placeOrders(buyCryptoOrder);
        
        }else if (choice == 2){ 
            // if user want to sell
             System.out.println("Enter varction Code: hint 123: ");
              String code = in.next();
                author = new authorizationProxy(code);
               author.tradingAccess();
           broker.placeOrders(sellCryptoOrder);
              }else if(choice == 3)
           {
             wallet.viewWallet();
            }
         
            }   
            

    }


    public static void startApp(Scanner in, wallet wallet) {

        System.out.println("-------------------------Welcome----------------");
        System.out.println("Please Enter : ");
        System.out.println("User Name: ");
        String Username = in.next();
        System.out.println("Password: ");
        String UserPass = in.next();
        User user = new User(Username, UserPass);

        System.out.println("your Blanace is 0 add some money to start trading ");
        System.out.println("How much you want to add: ");
        int balance = in.nextInt();
        
        wallet.setBalance(balance);
        wallet.setUsername(user);
        ///
 wallet.setBalance(balance);
        wallet.setUsername(user);

    }
}




