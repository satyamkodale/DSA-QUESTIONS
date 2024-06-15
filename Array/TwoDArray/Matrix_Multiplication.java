/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.TwoDArray;

/**
 *
 * 3 4   5 7
 * 2 4   4 6
 * @author Satyam
 */
public class Matrix_Multiplication
{
    public static void main(String [] args)
    {
        
//        int [][]arr1={{3,4},{2,4}};
//        System.out.println("Printing row wise");
//
//        for(int row=0; row<arr1.length; row++)
//        {
//            for(int col=0; col<arr1[row].length; col++)
//            {
//            
//            System.out.print(arr1[row][col]+" ");
//            }
//        System.out.println(" ");
//        }
//        
//        
//         System.out.println("Printing column wise works for");
//
//   
//     
//        for(int col=0; col<arr1.length; col++)
//        {
//            for(int row=0; row<arr1[col].length; row++)
//            {
//            
//            System.out.print(arr1[row][col]+" ");
//            }
//           System.out.println(" ");
//        }
//           
//           
//           
//         System.out.println("or method only change order of row and coln Printing column wise");
//            
//         System.out.println("Printing column wise");
//         
//         for(int row=0; row<arr1.length; row++)
//        {
//            for(int col=0; col<arr1[row].length; col++)
//            {
//            
//            System.out.print(arr1[col][row]+" ");
//            }
//        System.out.println(" ");
//        }

             
            
        
        int a[][]={{1,2,3},{4,5,6}};
        
        int b[][]={{5,6,7,8},{9,6,4,5},{4,5,6,7}};
        
        if(a[0].length!=b.length)
        {
            System.out.println("multilpcation not possible");
        }
        
        int [][]c=new int[a.length][b[0].length];
        
        for(int row=0; row<a.length;row++)
        {
                
            for(int col=0; col<b[0].length; col++)
            {
              int count=0;
              while(count<a[0].length)
             {
                c[row][col]+=(a[row][count])*(b[count][col]);
                count++;
             }
                
            }
         
        }
        
        
        for(int row=0; row<c.length;row++)
        {
            for(int col=0; col<c[0].length; col++)
            {
            
            System.out.print(c[row][col]+" ");
            }
            System.out.println(" ");
        }
        
    }
    
}
