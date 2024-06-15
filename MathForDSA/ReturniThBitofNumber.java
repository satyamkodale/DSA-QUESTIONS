/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.MathForDSA;

import java.util.Scanner;


public class ReturniThBitofNumber {
    public static void main(String[]a)
    {
        // low complexity soln by shift operator
        int num1=10111001;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bit do you need");
        int ithbit=sc.nextInt();
        
      
        System.out.println((num1>>(ithbit-1))&1);
        
        
        
        
        
       //bruth force soln 
//        int num=10110110;
//        int index =5;
//        
//        int count=index-1;
//        
//        while(count!=0)
//        {
//            num=num/10;
//            count--;
//            
//        }
//        int ith=num%10;
//        System.out.println(ith);
//    
    }
    
}
