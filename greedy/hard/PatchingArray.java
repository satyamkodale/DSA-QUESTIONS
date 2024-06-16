/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.greedy.hard;


/**
 *
 * @author Satyam
 */
public class PatchingArray {
    
}
class Pat {
    public int minPatches(int[] nums, int n) 
    {
        
        
        long ans=0;
        int patches=0;
        int i=0;
        while(ans<n)
        {
            if((i<nums.length) && (nums[i]<=(ans+1)))
            {
                ans+=nums[i];
                i++;
            }
            else
            {
                ans+=(ans+1);
                patches++;

            }

        }
           return patches;

        // used logic of related problem 

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]<=(ans+1))
        //     {
        //         ans+=nums[i];
        //     }
        //     else
        //     {
        //         ans+=(ans+1);
        //         patches++;

        //     }

        // }
        //return patches;
        
    }
}