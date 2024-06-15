/*
Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

 

Example 1:

Input: nums = [2,1,2]
Output: 5
Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
Example 2:

Input: nums = [1,2,1,10]
Output: 0
Explanation: 
You cannot use the side lengths 1, 1, and 2 to form a triangle.
You cannot use the side lengths 1, 1, and 10 to form a triangle.
You cannot use the side lengths 1, 2, and 10 to form a triangle.
As we cannot use any three side lengths to form a triangle of non-zero area, we return 0.
 */
package com.javadsa.Array.Easy.Greedy;

import java.util.Arrays;

/**
 *
 * @author Satyam
 */

public class Largest_Perimeter_Triangle {
    public int largestPerimeter(int[] nums)
    {
        //a+b>c
        //a+c>b
        //c+b>a
        // then its valid 
        //but when 
        //a<b<c and and a+b>c then no need to check other 
        //condiions bcoz when two small sides are larger than 3rd one its
        // valid triangle 
        //so we simple sort the array 

        // so we need maxmium periter triangle
       Arrays.sort(nums);
       int perimeter=0;

       for(int i=nums.length-1; i>1; i--)
       {
           if(nums[i-2]+nums[i-1]>nums[i])
           {
               perimeter=Math.max(perimeter,nums[i-2]+nums[i-1]+nums[i]);
           }
       }
       return perimeter;
       
             
    }
    
}
