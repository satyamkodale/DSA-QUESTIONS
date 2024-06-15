
package com.javadsa.Array.Easy;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
           int  consicative1=0;
           int previous=0;
            for(int i=0; i<nums.length;i++)
            {
               if(nums[i]==1)
               {
                  consicative1++;
               }
               else if(nums[i]==0)
               {
                   if(previous<=consicative1)
                   {
                       previous=consicative1;
                   }
                   consicative1=0;
               }

            }
           if(previous<=consicative1)
           {
               return consicative1;
           }
           else
           {
               return previous;
           }
        
    }
}
    
public class ConsicativesOf1
{
    
    public static void main(String [] a)
    {
        int [] nums = {1,1,0,1,1,1};
        
        Solution s= new Solution();
        int consicative=s.findMaxConsecutiveOnes(nums);
        System.out.println(consicative);
        
    }
    
}
