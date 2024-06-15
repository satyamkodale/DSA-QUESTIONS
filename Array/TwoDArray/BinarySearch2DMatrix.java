/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.TwoDArray;

/**
 *
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
* 
* Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 */
public class BinarySearch2DMatrix {
    
     public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row=matrix.length;
        int col=matrix[0].length;

        int start =0;
        int end=(row*col)-1;

        int mid=start+(end-start)/2;
        
         while(start<=end)
         { 
             int element= matrix[mid/col][mid%col];

             if(element==target)
             {
                 return true;
             }
             if(element<target)
             {
                   start=mid+1;
             }
             else 
             {
                 end=mid-1;
             }

             mid=start+(end-start)/2;
         }

        return false;

        
    }
}
