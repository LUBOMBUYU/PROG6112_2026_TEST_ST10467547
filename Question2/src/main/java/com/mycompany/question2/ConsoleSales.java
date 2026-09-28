/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

/**
 *
 * @author emeris
 */
public subclass ConsoleSales extends Console {

    public ConsoleSales(String consoleDeviceType, String storeName, int totalSales) {
        super(consoleDeviceType, storeName, totalSales);

      

       public void printReport() {
           // Print the sales report for the console device type
             
            System.out.println("CONSOLE SALES REPORT");
            System.out.println("*".repeat(50));
            System.out.printf("Console Device Type: %s%n", getConsoleDeviceType());
            System.out.printf("Store Name: %s%n", getStoreName());
            System.out.printf("Total Sales: %d%n", getTotalSales());

            
        }


    }
