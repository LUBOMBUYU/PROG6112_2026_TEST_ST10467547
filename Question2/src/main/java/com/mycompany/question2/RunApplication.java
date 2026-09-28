/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

/**
 *
 * @author emeris
 */

public class RunApplication {
    public static void main(String[] args) {
        // Create instances of ConsoleSales for different console device types and stores
        ConsoleSales ps5Sales = new ConsoleSales("PS5", "Cape Town Store", 1000);
        ConsoleSales xboxSales = new ConsoleSales("XBOX", "Port Elizabeth Store", 2000);
        ConsoleSales switchSales = new ConsoleSales("SWITCH", "Pretoria Store", 1500);

        // Print the sales report for each console device type
        ps5Sales.printReport();
        xboxSales.printReport();
        switchSales.printReport();
    }
}