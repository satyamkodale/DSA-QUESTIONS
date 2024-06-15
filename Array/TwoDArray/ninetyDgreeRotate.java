
package com.javadsa.Array.TwoDArray;

/**
 *
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
* 
* 
* DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
 */
public class ninetyDgreeRotate {
    public void rotate(int[][] matrix) {

        int row=matrix.length;
        int col=matrix[0].length;


        int startingRow=0;
        int startingCol=0;
        int endingRow=row-1;
        int endingCol=col-1;
          int  target=row*col;
          int count=0;
          while(count<target)
          {
               int rindex=endingCol;
              for(int index=startingCol; count<target && index<endingCol; index++)
              {
                  int startingRowStart=matrix[startingRow][index];
                  int startingRowEnd=matrix[index][endingCol];
                  int endingRowEnd=matrix[endingRow][rindex];
                  int endingRowStart=matrix[rindex][startingCol];
                  
                //   int temp =endingRowStart;
                //   endingRowStart=endingRowEnd;
                //   endingRowEnd=startingRowEnd;
                //   startingRowEnd=startingRowStart;
                //   startingRowStart=temp;
                  
                        
                  int temp =endingRowStart;
                  matrix[rindex][startingCol] =endingRowEnd;
                  matrix[endingRow][rindex]=startingRowEnd;
                  matrix[index][endingCol]=startingRowStart;
                  matrix[startingRow][index]=temp;

                  rindex--;      
              }
                count+=((endingCol-startingCol+1)*4)-4;
                
                startingRow++;
                startingCol++;
                endingRow--;
                endingCol--;




          }



        
    }
    
    
}
