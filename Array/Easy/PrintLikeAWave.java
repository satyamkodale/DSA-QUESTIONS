/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;

import java.util.*;
public class PrintLikeAWave
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int [][] arr2 = new int[3][4];
        
        
        System.out.println("enter value in matrix");

        
        for(int i=0; i<arr2.length;i++)
        {
            for(int j=0; j<arr2[i].length;j++)
            {
            
                arr2[i][j]=sc.nextInt();
            }
        
        
        }
        
                System.out.println("normal ... matrix");

             
        for(int i=0; i<arr2.length;i++)
        {
            for(int j=0; j<arr2[i].length;j++)
            {
            
                System.out.print(arr2[i][j]);
            }
        
            System.out.println(" ");
        
        }
        
        
        
        
        
        System.out.println("wave matrix");
        
        for(int col=0; col<4;col++)
        {
            if(col%2==0){
            for(int row=0; row<3;row++)
             {
            System.out.println(arr2[row][col]+" ");
             }
            }
            else if (col%2==1)
            {
             
                System.out.println("hello");
              for(int row=2; row>=0;row--)
             {
               System.out.println(arr2[row][col]+" hello ");          
             }
           
              
            }
            
            System.out.println(" ");
            
        }
        
        
        
    
    
    }
}
