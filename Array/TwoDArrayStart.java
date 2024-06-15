/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array;

import java.util.Scanner;


public class TwoDArrayStart {
    
    
    
    public static boolean isPresent(int arr[][],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length; j++)
            {
                if(target==arr[i][j])
                {
                    return true; 
                }
            }
        }
        return false;
        
    
    }
    
       public static void rowWiseSum(int arr[][])
    {
        int rowSum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length; j++)
            {
                rowSum+=arr[i][j];
             
            }
            System.out.println("sum of Row ->"+i+"--is-->"+rowSum);
            rowSum=0;
        }
       
        
    
    }
    
    public static void main(String [] args)
    {
        
        Scanner sc = new Scanner(System.in);
        //2d array
        int [][] arr1 = new int[3][4];
        System.out.println("enter  row wise  input to  array");

        //taking  input row wise
        for(int row=0; row<arr1.length;row++)
        {
        for(int col=0; col<arr1[row].length;col++)
        {
           arr1[row][col]= sc.nextInt();
        }
        
        }
        
        //Linear Search On 2D Array
      System.out.println(isPresent(arr1,2)+"element found");
        
      
      //row Wise Sum Problem
       rowWiseSum(arr1);
        
        
        //printing 
        System.out.println("printing row wise taken input array");
        System.out.println("length of arr  -->"+arr1.length);

        for(int [] a1:arr1)
        {
        for(int a:a1)
        {
        System.out.print(a+" ");
        }
        System.out.println(" ");
        }
        
        
        
        //taking  input column wise
          int [][] arr2 = new int[3][4];
         System.out.println("enter  col wise  input to  array");
         
         System.out.println(arr2[2].length);

         

        for(int col=0; col<4;col++)
        {
        for(int row=0; row<3;row++)
        {
            arr2[row][col]=sc.nextInt();
        }
        
        }
        
        
          //printing 
        System.out.print("printing col wise taken input array");
        System.out.print("length of arr"+arr2.length);

        for(int [] a1:arr2)
        {
        for(int a:a1)
        {
        System.out.print(a+" ");
        }
        System.out.println(" ");
        }
        
        
        
        
        
        
        
        
       
      
     
    
    
    
    
    
    
    
    
    }
    
}
