/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy.DynamicProgramming;

/**
 *
 * @author Satyam
 */

import java.util.*;
public class Pascals_Triangle_2 {
//    Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
//
//    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown
    
    
    public static void main(String [] args)
    {
        
        int rowIndex=4;
        List<Integer> list = new ArrayList<>(rowIndex+1);
     
        
        for(int i=1; i<=rowIndex; i++)
        {
             int firstindex =0;
             int secondindex=1;
             int firstValue=1;
             
            for(int j=0; j<=i; j++)
            {
               if(j==0||j==i-1)
               {
                  list.add(firstindex,firstValue);
                  
               }
               else if(j==i)
               {
                   list.add(1);
               }
               else
               {
                   
                  firstValue= list.get(secondindex);
                   list.add(secondindex, firstValue + list.get(secondindex));
                   firstindex++;
                   secondindex++;
               }
                
            
            }
        }
    } 
    
}

//[ 1 , 1 1, 1 2 1 , 1 3 3 1,   1 4 6 4 1 , 1 5 10 10 5 1];    //  1* 4 6 4 1 _             fv=4; 
                  // 0 1 2 3 4
//4  [ ,,, , ]
//[0  ,1,2, 3,4,5 , 6,7,8,9, 10,11,12,13,14];