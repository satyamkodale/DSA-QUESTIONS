/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.MathForDSA;

import java.util.Scanner;


public class FindNoIsInPowerOf2 {
    public static void main(String[]args)
    {
        
         
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check");
        int num= sc.nextInt();
        if((num&(num-1))==0)
        {
                 System.out.println(" is in 2^n series");
        }
        else{
                         System.out.println("not in 2^n series");

        }
        
        
    
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number to check");
//        int num= sc.nextInt();
//        int count=0;
//        while(!(num==0))
//        {
//           
//            if((num&1)==1)
//            {
//                count=count+1;
//            }
//            num=num>>1;
//        
//        }
//        if(count>1)
//        {
//            System.out.println("not in 2^n series");
//        }
//        else
//        {
//            System.out.println("in 2^n series");
//        }
//    
//    }
//    
        }
}
