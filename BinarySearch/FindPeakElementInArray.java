/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.BinarySearch;

/**
 *
 * @author Satyam
 */
public class FindPeakElementInArray {
    
   public int findPeakElement(int[] nums) 
    {
      int start=0;
      int end=nums.length-1;
      
      while(start<=end)
      {
          int mid=start+(end-start)/2;
          if(nums[mid]<nums[mid+1])
          {
              start=mid+1;
          }
          else
          {
              end=mid;
          }
          
          
      }
      return end;
    }
    
    
}
