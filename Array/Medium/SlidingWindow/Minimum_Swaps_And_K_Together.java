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

public class Minimum_Swaps_And_K_Together {
      public static int minSwap (int arr[], int n, int k) 
    {
        //Complete the function
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<=k)
            {
                count++;
            }
        }
        
        int nonfav=0;
        for(int i=0; i<count;i++)
        {
            if(arr[i]>k)
            {
                nonfav++;
            }
        }
        int start=0;
        int end=count-1;
        int result=Integer.MAX_VALUE;
        while(end<n)
        {
            result=Math.min(result,nonfav);
            end++;
            if(end<n && arr[end]>k)
            {
                nonfav++;
            }
            if(start<n&&arr[start]>k)
            {
                nonfav--;
            }
            start++;
        }
        
        return (result==Integer.MAX_VALUE)?0:result;
          
           
       }
    
    
    
    
}
