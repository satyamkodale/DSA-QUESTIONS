/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Medium;

/**
 *
 * @author Satyam
 */

import java.util.*;
public class E3Sum {
    
    //most optimal without hashset 
     public List<List<Integer>> threeSum(int[] arr) 
     //withouthashset
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            int j=i+1;
            int k=n-1;

            if(i!=0 && arr[i]==arr[i-1])continue;
            while(j<k)
            {
                int sum = arr[i]+arr[j]+arr[k];

                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }


            }

        }


  return ans;

    }
    
    
    class Solution {
    public List<List<Integer>> threeSum(int[] arr) 
    {

        Arrays.sort(arr);

      Set<List<Integer>> result = new HashSet<>();
      
        for(int i=0; i<arr.length-2; i++)
        {
            int left=i+1;
            int right=arr.length-1;

            while(left<right)
            {
                if(arr[i]+arr[left]+arr[right]==0)
                {
                    List<Integer> temp = new ArrayList<>();
                    
                    temp.add(arr[i]);
                    temp.add(arr[left]);
                    temp.add(arr[right]);
                   // it is also correct
                  // result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    result.add(temp);
                    left++;
                    right--;
                }
                if(arr[i]+arr[left]+arr[right]>0)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }


        }
        return new ArrayList(result);
    }
}
    
}
