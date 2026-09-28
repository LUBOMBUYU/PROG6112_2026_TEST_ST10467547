/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

/**
 *
 * @author emeris
 */
public abstract class Console implements IConsole {

    // Instance variables
    private String consoleDeviceType;
    private String storeName;
    private int totalSales;

    public Console(String consoleDeviceType, String storeName, int totalSales) {
        this.consoleDeviceType = consoleDeviceType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    
    public String getConsoleDeviceType() {
        return consoleDeviceType;
    }

   
    public String getStoreName() {
        return storeName;
    }

    
    public int getTotalSales() {
        return totalSales;
    }
}