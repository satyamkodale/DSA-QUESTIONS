/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;

/**
 *
 * @author Satyam
 * * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?

* 
* 
* 
* 
 */
public class Squares_Of_A_Sorted_Array {
    /* here simple solution is we need store abs(i) square to end then like this 
    -- but here twist is it also contain negative numbers so   is we used pointer and after comparing we have stored  */
     public int[] sortedSquares(int[] nums)
    {

        int [] result = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int k=result.length-1; k>=0; k--)
        {
            int left=Math.abs(nums[i]);
            int right=Math.abs(nums[j]);

            if(left<=right)
            { //right is grater 

            result[k]=right*right;
            j--;


            }
            else
            {
                //left is greater
                result[k]=left*left;
                i++;

            }

            
        }

return result;
        
    }
    
}
