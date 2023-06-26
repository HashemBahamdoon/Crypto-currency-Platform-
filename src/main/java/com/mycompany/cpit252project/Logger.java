/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252project;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Logger {

    DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
    String currentDateTimeString = LocalDateTime.now().format(myFormatter);
    private final String logFile = currentDateTimeString + ".txt";
    private PrintWriter writer;
//   ***
    private static Logger logger = null;
//   ***
    private Logger() {
//   ***        
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
//   ***
    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();

        }
        return logger;
    }
//   ***
    public void info(String message) {
        writer.println( message);
    }

    public void error(String message) {
        writer.println("Error: " + message);
    }
  @Override
    public String toString() {
        return " your order is ";
    }
}
