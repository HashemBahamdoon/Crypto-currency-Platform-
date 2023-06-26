/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252project;



import java.util.HashMap;
import java.util.Scanner;



public class cryptocurrency {

         Logger logger = Logger.getLogger();
      
    HashMap<String, String> coins = new HashMap<String, String>();

    public void coin() {

        coins.put("BTC", "46000");
        coins.put("ETH", "5000");
        coins.put("XRP", "1.2");
        coins.put("doge", "0.21");

    }

    public String coinName(int i) {
        return coins.get(i);
    }

    public double getPrice(String coinName) {
       double price = 0;
        
        for (String i : coins.keySet()) {
            if (i.equalsIgnoreCase(coinName)) {
                price = Double.parseDouble(coins.get(i)) ;
               break;
            }
        }
        return price;

    }

    public void buy() {
        cryptocurrency c = new cryptocurrency();

        printCrypto(c);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coin Name: ");
        String Namecoin = in.next();
        System.out.println("Enter quantity: ");
        double quantity = in.nextDouble();
        System.out.println("----------------------------");
     
        double sum = quantity * c.getPrice(Namecoin);

        if (wallet.getWallet().getBalance() < sum) {
            System.out.println("Sorry your balance is low");
        } else {
             wallet.getWallet().setBalance(wallet.getWallet().getBalance() - sum);
                System.out.println("Seccussed ");
                System.out.println("your balance is "+wallet.getWallet().getBalance());
                 wallet.getWallet().buyCurrnecy(Namecoin,quantity);
               logger.info("A new order was created");

                  logger.info(this.toString("Buy",Namecoin,quantity));
    }

   
            
            //  System.out.println("you bought : " + Quantity + "of :" + name);
        }
    



    public void sell()
    {
       cryptocurrency c = new cryptocurrency();

        printCrypto(c);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coin Name: ");
        String Namecoin = in.next();
        System.out.println("Enter quantity: ");
        double quantity = in.nextDouble();
        System.out.println("----------------------------");
        
         
       
        
        double sum = quantity * c.getPrice(Namecoin);
  
       
            if (wallet.getWallet().getCurrnecy(Namecoin)!= true ) {
                System.out.println("You don't have any "+Namecoin);
             
            } else {
                System.out.println("Seccussed ");
              wallet.getWallet().sellCurrnecy(Namecoin, quantity);
               logger.info("INFO: A new order was created");

                  logger.info(this.toString("Sell",Namecoin,quantity));
               
            }
    }

    public void printCrypto(cryptocurrency c) {

        c.coin();

        int count = 1;

        for (String i : c.coins.keySet()) {
            System.out.println(count + ". coin " + i + " Price " + c.coins.get(i));
            count++;
        }
    }

   public String toString(String operation,String coinName,double quantity)
        { 
             if(operation.equalsIgnoreCase("Buy"))
            {
               return operation+" "+"coin: "+coinName+" "+"quantity: "+quantity+".";
             }else if(operation.equalsIgnoreCase("Sell"))
            {
                  return operation+" "+"coin: "+coinName+" "+"quantity: "+quantity+".";
            }else
                 {
                    return null;
                 } 
               
        }
}
