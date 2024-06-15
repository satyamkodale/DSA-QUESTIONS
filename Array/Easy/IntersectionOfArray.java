/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;
import java.util.*;


//Given two integer arrays nums1 and nums2, return an array of their intersection. 
//Each element in the result must be unique and you may return the result in any order.

 

//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
public class IntersectionOfArray 
{
     public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer>  set1 = new HashSet<>();
        for(int n1:nums1)
        {
            set1.add(n1);
        }
        HashSet<Integer>  set2 = new HashSet<>();
        for(int n2 : nums2)
         {
             if(set1.contains(n2))
             {
                 set2.add(n2);
             }
         }

        int []intersection = new int[set2.size()];
         int i =0;
       for(int x:set2)
       {
           intersection[i]=x;
           i++;
       }

       return intersection;
        
  
    }
    public static void main(String[] args)
    {
       
     
    }
    
   
    
    
    
}
