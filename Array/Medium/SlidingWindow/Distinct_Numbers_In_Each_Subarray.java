/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Medium.SlidingWindow;

/**
 *
 * @author Satyam
 */
import java.util.*;
public class Distinct_Numbers_In_Each_Subarray {
    
//    Input: nums = [1,2,3,2,2,1,3], k = 3
//Output: [3,2,2,2,3]
//Explanation: The number of distinct elements in each subarray goes as follows:
//- nums[0:2] = [1,2,3] so ans[0] = 3
//- nums[1:3] = [2,3,2] so ans[1] = 2
//- nums[2:4] = [3,2,2] so ans[2] = 2
//- nums[3:5] = [2,2,1] so ans[3] = 2
//- nums[4:6] = [2,1,3] so ans[4] = 3
    
    public static void main(String [] args){
    
           int arr[] = new int [10];
           int k=3;
           Map<Integer,Integer> map= new HashMap<>();
           int result[] = new int[arr.length-k+1];
           int j=0;
    for(int i =0 ; i<k; i++)
    {
         map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
    }
    result[j]=map.size();
    j++;
    int s=0; 
    for(int p=k; p<arr.length; p++)
    {
        map.put(arr[p],map.getOrDefault(arr[p], 0)+1 );
        map.remove(arr[s]);
        s++;
        arr[j]=map.size();
        j++;
    }
    
//    return result;
    
    }
 
}
