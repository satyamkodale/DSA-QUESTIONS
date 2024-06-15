/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.MathForDSA;

/**
 *
 * @author Satyam
 */
import java.util.Scanner;

public class HCFandLCM {
    
    // Function to calculate HCF of two numbers
    static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num1;
    }
    
    // Function to calculate LCM of two numbers
    static int calculateLCM(int num1, int num2) {
        int hcf = calculateHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;
        return lcm;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate HCF
        int hcf = calculateHCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        
        // Calculate LCM
        int lcm = calculateLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        scanner.close();
    }
}
