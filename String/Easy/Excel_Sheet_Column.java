/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.String.Easy;

/**
 *
 * @author Satyam
 */
public class Excel_Sheet_Column {
     public int titleToNumber(String columnTitle) 
    {
        char [] arr = columnTitle.toCharArray();

        int result=0;
        for(int i=0; i<arr.length;i++)
        {
          int num=arr[i]-65+1;
          result = 26*result +num;
        }
        return result;

        
    }
     
    
}
