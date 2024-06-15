/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.TwoDArray;

/**
 *
 * @author Satyam
 */
public class DiagonalPrinteasy {
    
//    1 2 3 
//    4 5 6
//    7 8 9 
//    output -> 1 ,5, 9, 2 ,6, 3 
//    
//    00 01 02-gap of ij  3
//       11 12- gap 1
//          22-gap 0
    
    public static void main(String [] ar){
        
        
        int arr[][]=new int [3][3];
        //for demo
        int length=arr[0].length;
        
   for(int g=0; g<arr[0].length; g++)
   {
      for(int i=0, j=g; i<length; i++,j++)
      {
          System.out.print(arr[i][j]);
      }
      length--;
   }
    }
        
    
    
}
