/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;

/**
 *
 * @author emeris
 */
public class Question1 {

    public static void main(String[] args) {
       
        
        // Array sales
          int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000}, 
            {1500, 1100, 1200}
        };
          // Array Consoles
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        // Array Cities
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        System.out.println("-".repeat(50));
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-".repeat(50));

        System.out.printf("%-20s%-10s%-10s%-10s%n", "", consoles[0], consoles[1], consoles[2]);

        int totalCapeTown = 0;
        int totalPortElizabeth = 0;
        int totalPretoria = 0;
       
        
        // loop to deliveries that calculates the totals for each console
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-20s", cities[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d", sales[i][j]);
                if (i == 0) {
                    totalCapeTown += sales[i][j];
                } else if (i == 1) {
                    totalPortElizabeth += sales[i][j];
                } else if (i == 2) {
                    totalPretoria += sales[i][j];
                }
            }
            // Checking who has the highest sales for each console
            if (sales[i][0] > sales[i][1] && sales[i][0] > sales[i][2]) {
                System.out.printf("%-10s", consoles[0]);
            } else if (sales[i][1] > sales[i][0] && sales[i][1] > sales[i][2]) {
                System.out.printf("%-10s", consoles[1]);
            } else if (sales[i][2] > sales[i][0] && sales[i][2] > sales[i][1]) {
                System.out.printf("%-10s", consoles[2]);
            } else {
                System.out.printf("%-10s", "TIE");
            }
            System.out.println();
        }
        System.out.println("-".repeat(50));
        System.out.printf("CONSOLE SALES TOTALS FOR EACH CITY%n");
        System.out.printf("%-20s%-10d%n", cities[0], totalCapeTown);
        System.out.printf("%-20s%-10d%n", cities[1], totalPortElizabeth);
        System.out.printf("%-20s%-10d%n", cities[2], totalPretoria);
        System.out.println("CITY WITH HIGHEST SALES: " + (totalCapeTown > totalPortElizabeth && totalCapeTown > totalPretoria ? cities[0] : 
            (totalPortElizabeth > totalCapeTown && totalPortElizabeth > totalPretoria ? cities[1] : cities[2])));
        System.out.println("-".repeat(50));
       
    }
}
