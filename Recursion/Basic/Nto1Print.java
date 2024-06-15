/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Recursion.Basic;


public class Nto1Print {
    
    public static void main(String [] args)
    {
        System.out.println( print(5) + "addition ");
        System.out.println("----------------------------------------------------");
        printreverse( 5);
        System.out.println("----------------------------------------------------");
         printBoth(5);
        System.out.println("----------------------------------------------------");
        System.out.println(factorial(5));
        

    }
    
    public static int  print(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return n ;          
        }
        System.out.println(n);
        return n+=print(n-1);
      
    }
    
    public static void printreverse(int n)
    {
//        if(n==1)
//        {
//        System.out.println(n);
//        return ;
//        }
        if(n==0)
        {
       
        return ;
        }
       
        printreverse( n-1);
        System.out.println(n);
        
    }
    
    public static void  printBoth(int n)
    {
        
        if(n==0)
        {
        return ;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    
    }
    
    public static int factorial(int n )
    {
        if(n==1)
        {
            return n;
        }
        
        return n*=factorial(n-1);
    }
    
}
