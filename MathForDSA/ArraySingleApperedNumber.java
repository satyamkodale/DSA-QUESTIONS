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
public class ArraySingleApperedNumber {
    //logic a^0=a; a^a=0
    public static void main(String [] args)
    {
        int [] arr={2,3,5,4,3,2,4};
        System.out.println(findUnique(arr));
         
    
    }
    public static int findUnique(int[] arr)
    {
        int unique=0;
        for(int n:arr)
        {
//            unique=unique^n; or
            unique^=n;
        }
        return unique;
    }
    
}
