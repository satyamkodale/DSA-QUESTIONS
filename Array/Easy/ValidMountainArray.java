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
import java.util.*;
public class ValidMountainArray {
    
    
    public boolean validMountainArray(int[] nums)
    {
        
        
        
        int start=0;
        int end=nums.length-1;

        while(start< end)
        {
            if(nums[start]<nums[start+1])
            {
                start++;
            }
            else if(nums[end]<nums[end-1])
            {
                end--;
            }
            else
            {
                break;
            }
            
        }

        return start!=0&&end!=nums.length-1&&start==end;







    }
    
}
