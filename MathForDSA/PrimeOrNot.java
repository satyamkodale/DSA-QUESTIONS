/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.MathForDSA;

import java.util.*;
public class PrimeOrNot {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its prime or not");
                
        int num = sc.nextInt();
          //System.out.println(num);
          if(num%2==0)
          {
              num++;
          }
       for(int i =3;i<=num;i=i+2)
       {
         //  System.out.println(i-1+"is Not prime");
         
           primeOrNot(i);}
       
        
        
        
    }
    
    public static void primeOrNot(int num)
    { 
        boolean flag= true;
        for(int i =2; i*i<=num;i++)
        {
            if(num%i==0)
            {
                //System.out.println(num+"Not prime");
                flag=false;
                break;
           
                
                
            }
        }
        if(flag==true)
        {
            System.out.println(num+"is prime");
            
        }
        
    
    }
}
