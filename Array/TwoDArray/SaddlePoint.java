/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.TwoDArray;

/**
 *
 * @author Satyam
 * 
 * 1 2 4
 * 5 6 7
 * 8 9 10 
 *  
 * 
 * saddle point means mininum in row and maximum in col 
 * 8 
 * 
 * array can be sorted or unsorted 
 * 
 * saddle point only one exits if it is in array
 */
public class SaddlePoint {
    
    public static void main(String [] arg)
    {
     
        int arr[][]=new int[3][3];
        for(int row =0; row<arr.length; row++)
        {
            int svr=0;
            for(int value=0; value<arr[row].length; value++)
            {
                if(arr[row][value]<arr[row][svr])
                {
                    svr=value;
                }
            }
            boolean flag = true;
            for(int i=0;i<arr.length; i++)
            {
                if(arr[i][svr]>arr[row][svr])
                {
                    flag =false;
                    break;
                }
            
            }
            if(flag==true)
            {
                System.out.println(arr[row][svr]+"  -->saddle point found");
                return ;
            }
            
            
                   
        
        }
        System.out.println("  -->saddle doesn,t exits  found");

    
    
    }
}
