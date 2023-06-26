/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252project;

import java.util.ArrayList;

/**
 *
 * @author yaaz4
 */
public class wallet {
User username ;
double Balance;
String [][] currnecy ;
ArrayList<String> Coins = new ArrayList<String>();
ArrayList<Double> CoinsQuantity = new ArrayList<Double>();

    
public static wallet wallet = null;

    private wallet() {
    }

  /*  public wallet(User username, int Balance) {
        this.username = new User();
        this.Balance = Balance;
    }
*/
    public static wallet getWallet() {
        if (wallet == null) {
            wallet = new wallet();

        }
        return wallet;
    }

 

    public double getBalance() {
        return Balance;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public boolean getCurrnecy(String coinName) {
      boolean isExsist = false;
        for (String element : Coins){
         if (element.contains(coinName)){
             isExsist = true;
           break ;
         }
       
    }
        return isExsist;
        }
    public void buyCurrnecy(String coinName,double quantity) 
{
      Coins.add(coinName);
      CoinsQuantity.add(quantity);
       
    }
 
  public void sellCurrnecy(String coinName,double quantity) 
{
        
     for (String element : Coins){
         if (element.contains(coinName)){
            Coins.remove(element);

            break;
         }
       for (Double Quantityelement : CoinsQuantity){
         if (Quantityelement == quantity){
            CoinsQuantity.remove(Quantityelement);
          break;
         }
    }
    

}}

public void viewWallet()
        {  
            System.out.println("Your balance is: "+this.getBalance());
            for (String element : Coins){
                System.out.print("Coin: "+element);
          for (Double quantityElement : CoinsQuantity){
                   System.out.println("      quantity "+quantityElement);
             }
         }
       
    }

        }

    

