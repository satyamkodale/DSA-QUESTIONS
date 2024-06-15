
package com.javadsa.Array.Easy;
class Solution1 {
    public int singleNumber(int[] nums)
    {
        int xor=0;
        //n^0=n
        //n^n=0;

        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        return xor;
        
    }
}
public class InGroupOf2FindUniqueNumber 
{
    public static void main(String [] args)
    {
    
        int[] nums={2,3,2,4,5,4,6,7,5,6,7};
        Solution1 s = new Solution1();
       System.out.println(s.singleNumber(nums));
    }
    
    
}
