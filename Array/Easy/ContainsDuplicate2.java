/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;

//219. Contains Duplicate II

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//Easy
//5.6K
//2.9K
//Companies
//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false

public class ContainsDuplicate2
{
     public boolean containsNearbyDuplicate(int[] nums, int k)
    {
        
                Map<Integer,Integer> HashMap = new HashMap<>();

                for(int i=0; i<nums.length; i++)
                {
                    if(HashMap.containsKey(nums[i]))
                    {
                          int index =HashMap.get(nums[i]);
                          if(Math.abs(i-index)<=k)
                          {
                              return true;
                          }
                          
                    }

                    HashMap.put(nums[i],i);
                }
                return false;

        
    }
    
}
