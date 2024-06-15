/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;

/**
 *
 * @author Satyam
 */
import java.util.*;
public class Pascals_Trianle {
    
    static long nCr(int n , int r)
    {
        int rr = Math.min(r,n-r);
        
        long result=1;
        
        for(int i=1; i<=r; i++)
        {
            result= result*(n-i+1)/i;
        
        
        }
        return result;
        
    }
    
    public static void main(String [] args)
    {
        
       int n=3;
       
       for(int i=0; i<=n; i++)
       {
       
           System.out.println(nCr(n,i));
       }
    
    }
}
