/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;

/**
 *
 * @author Satyam
 */
public class Smallest_Subarray_with_sum_greater_than_a_given_value {
      public static int smallestSubWithSum(int arr[], int n, int x)
    {
       
          
            
            
        int start =0;
        int end =0;
        int ans = Integer.MAX_VALUE;
        int sum =0;
        while(end < n){
            while(sum <=x && end<n){
                sum +=arr[end++];
            }
            
            while(sum>x && start <n){
                ans = Math.min(ans , end-start);
                sum -=arr[start++];
            }
        }
        return (ans ==Integer.MAX_VALUE)?0 : ans;
        
        // Your code goes here 
    }
}
