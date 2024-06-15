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
 * Given a binary matrix of size N x M, you enter the matrix at cell (0, 0) in the left to the right direction. Whenever encountering a 0  retain in the same direction if encountered a 1 change direction to the right of the current direction and change that 1 value to 0,  find out exit point from the Matrix.

Examples: 

Input: matrix = {{0, 1, 0},

                          {0, 1, 1},


                          {0, 0, 0}}
Output: 1 0
Explanation: 
Enter the matrix at 0, 0 -> then move towards 0, 1 ->  1 is encountered -> turn right towards 1, 1 -> again 1 is encountered -> turn right again towards 1, 0 -> now, the boundary of matrix will be crossed ->hence, exit point reached at 1, 0.
 

Input: matrix = {{0, 0}}
Output: 0 1

 
 */
public class ExitPointOfArray
{
    public String ExitPoint(int arr[][])
    {
               int dir=0; 
//        0-east-> i j++;
//        1-south->i++ j;
//        2-west->i j--;
//        3-north->i-- j;

//if we turned 90drgee from north we have to go to east

          int i=0; 
          int j=0;
         while(true)
         {
            
             dir = (dir+arr[i][j])%4;
             
             if(dir==0)
             {
                 j++;
             }
             else if(dir==1)
             {
             
                 i++;
             }
              else if(dir==2)
             {
             
                 j--;
             } 
              else if(dir==3)
             {
             
                 i--;
             }
             
             if(i<0)
             {
                 i++;
                 break;
             
             }
              else if(j<0)
             {
                 j++;
                 break;
             
             }
              else if(i==arr.length)
             {
                 i--;
                 break;
             
             }
                 else if(j==arr.length)
             {
                 j--;
                 break;
             
             }
             
         
         }
        
         System.out.println(i+""+j+"");
    return i+" "+j;
    
    }
    public static void main(String[] arg)
    {
    
 
    
    
    }
    
}
