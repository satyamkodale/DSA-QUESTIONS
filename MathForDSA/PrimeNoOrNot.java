/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.MathForDSA;

import java.util.Arrays;

/**
 *
 * @author Satyam
 */
public class PrimeNoOrNot {
    
    
    public static void prime(int n)
    {
//        boolean[]check = new boolean[num+1];
//        Arrays.fill(check, true);
//        check[0]=check[1]=false;
//        
//        for(int i=2; i*i<=num; i++)
//        {
//            if(check[i])
//            {
//                for(int p = i*i; i<=num; p+=i)
//                {
//                   check[i]=false;   
//                }
//            }
//        }
//        for(int i=2; i<=num; i++)
//        {
//          
//            if(check[i])
//            {
//            System.out.print(i+" ");
//            }
//        }
//        
         boolean[] is_prime = new boolean[n + 1];
        Arrays.fill(is_prime, true);
        is_prime[0] = is_prime[1] = false;
        for (int p = 2; p * p <= n; p++) {
            if (is_prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    is_prime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (is_prime[i]) {
                System.out.print(i + " ");
            }
        }
    
    }
    
    public static void main(String [] args)
    {
        prime(100);
    }
    
}
