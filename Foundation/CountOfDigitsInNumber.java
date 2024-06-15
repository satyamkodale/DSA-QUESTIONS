/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Foundation;

import java.util.Scanner;


public class CountOfDigitsInNumber {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int num = sc.nextInt();
      
      boolean flag = true;
      int count=0;
      while(num!=0)
      {    
          System.out.println(num%10);
          num=num/10;
          count++;
      
      }
      System.out.println("Count of number is"+count);
      
      
      
    }
    
}
