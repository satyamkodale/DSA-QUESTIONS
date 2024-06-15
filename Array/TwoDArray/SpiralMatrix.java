/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.TwoDArray;

import java.util.*;

/**
 *
 Given an m x n matrix, return all elements of the matrix in spiral order.
 * traverse it 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
 */
public class SpiralMatrix {
     public List<Integer> spiralOrder(int[][] matrix) 
    {
        ArrayList<Integer> result = new ArrayList<>();
         int row=matrix.length;
         int col=matrix[0].length;

         int startingRow=0;
         int startingCol=0;
         int endingRow=row-1;
         int endingCol=col-1;
    
          int target=row*col;
          int count=0;

          while(count<target)
          {
              //printing string row
               for(int index=startingCol; count<target &&index<=endingCol; index++)
               {
                   result.add(matrix[startingRow][index]);
                   count++;
               }
               startingRow++;




               //printing ending col
            for(int index=startingRow; count<target&&index<=endingRow;index++)          {

                   result.add(matrix[index][endingCol]);
                   count++;

            }
            endingCol--;





               //printing ending row
         for(int index=endingCol; count<target&& index>=startingCol;index--)
         {
                result.add(matrix[endingRow][index]);
                   count++;

         }
                     endingRow--;
               //printing starting col

 for(int index=endingRow; count<target&&index>=startingRow; index-- )
         {
                result.add(matrix[index][startingCol]);
                   count++;

         }
                     startingCol++;



          }

return result;
        
    }
    
}
