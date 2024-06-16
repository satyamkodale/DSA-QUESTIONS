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
        System.out.println("----------------------------------------------------");
        System.out.println(digitsSum(1343));
        System.out.println("----------------------------------------------------");
        System.out.println(reverseNum(1343,0));
        System.out.println("----------------------------------------------------");
        System.out.println(reverseNum2(1343));
        
        

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
    
    public static int digitsSum(int n)
    {
//        int r = n%10;
//        if(n/10==0)
//        {
//           return n;
//        }
//        n=n/10;
//        return r+digitsSum(n);
        if(n==0)
        {
        return 0;
        }
        
        return (n%10) + digitsSum(n/10);
    }
    public static int reverseNum(int num,int reverseNum)
    {
    
        reverseNum=reverseNum*10+num%10;
        if(num%10==num)
        {
            return reverseNum;
        }
        num=num/10;
        return reverseNum(num,reverseNum);     
    } 
    
    
    public static int reverseNum2(int n)
    {
    
        int digits= (int)(Math.log10(n))+1;
        return helper( n , digits);  
    }
    
    public static int helper(int n, int digits)
    {
        if(n%10==n)
        {
            return n;
        }
        return (n%10) * (int)Math.pow(10,digits-1)+helper(n/10,digits-1);

    }
    
    
}
