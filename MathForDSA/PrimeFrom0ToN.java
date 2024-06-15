/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.MathForDSA;

import java.util.*;

public class PrimeFrom0ToN 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         boolean[] primes = new boolean[n+1];
      boolean b = primes[2];
          
       
       primesof0toN(n, primes);
          
        
    }
    
 
    
    public static void primesof0toN(int n,boolean[] primes)
    {
         for(int i=2; i*i<=n;i++)
         {
             if(primes[i]==false)
             {
              for(int j=i*2;j<=n;j+=i)
              {
                     primes[j]=true;
              }
             }
         
         }
         for(int i=2;i<=n; i++)
         { 
          
                 if(primes[i]==false)
                 {
                     System.out.println(i);         
                 }
         
         }
    
    }
    
}


