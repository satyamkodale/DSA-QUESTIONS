/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Medium;

import java.util.Arrays;

/**
 *
 * @author Satyam
 */
public class Repeat_And_Missing_Number_Array {
    public static void main(String [] args)
    { 
        
        
       // int [] A =  {3,1,2,5,3};
        int [] A =  {2,2,1,5,3};
        int [] arr = new int [A.length];
        
        
        int requiredSum=(A.length*(A.length+1))/2;
        int totalSum=0;
        int repeatedNumber=-1;
        for(Integer a : A)
        {
            if(arr[a-1]==0)
            {
                totalSum+=a;
                arr[a-1]=a;  
            }
            else
            {
                repeatedNumber=a;
            }
            
        }
         int missingNumber= requiredSum-totalSum;
         
         System.out.println(repeatedNumber+"--"+missingNumber);
    
    
    }
}
