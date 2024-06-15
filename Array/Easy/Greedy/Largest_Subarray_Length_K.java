/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy.Greedy;

/**
 *
 * @author Satyam
 * 1708. Largest Subarray Length K
An array A is larger than some array B if for the first index i where A[i] != B[i], A[i] > B[i].

For example, consider 0-indexing:

[1,3,2,4] > [1,2,2,4], since at index 1, 3 > 2.
[1,4,4,4] < [2,1,1,1], since at index 0, 1 < 2.
A subarray is a contiguous subsequence of the array.

Given an integer array nums of distinct integers, return the largest subarray of nums of length k.

 

Example 1:

Input: nums = [1,4,5,2,3], k = 3
Output: [5,2,3]
Explanation: The subarrays of size 3 are: [1,4,5], [4,5,2], and [5,2,3].
Of these, [5,2,3] is the largest.
Example 2:

Input: nums = [1,4,5,2,3], k = 4
Output: [4,5,2,3]
Explanation: The subarrays of size 4 are: [1,4,5,2], and [4,5,2,3].
Of these, [4,5,2,3] is the largest.
Example 3:

Input: nums = [1,4,5,2,3], k = 1
Output: [5]
 */
public class Largest_Subarray_Length_K {
    public static void main(String [] args)
    {
        int arr[]={4,9,7,2,8,5,1,6,3};
        int k=3;
        
//        we onlu need to watch on 1st element of subarray of size k
//and store it in some variale 
// and go one by one till end array -> length()-k;  9-3 => 6 index  -> length()-1 9-1-> 8 index ; exa..,{1,6,3} 
          int i =0;
          int maxEle=arr[0];
          int maxEleIndex=arr[0];
         while(i<=arr.length-k)
         {
             if(arr[i]>maxEle)
             {
                 maxEle=arr[i];
                 
                 maxEleIndex=i;
             }
         }

        int result[]=new int[k];
        int z=0;
        for(int p=maxEleIndex;p<maxEleIndex+k;p++)
        {
            result[z]=arr[p];
        }
        
        //return result;



    }
    
    
}
