/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.greedy.Medium;
import java.util.*;

/**
 *
 * @author Satyam
 */
public class maxnumreqtomakeconsicative {
    
}

class Solution {
    public int getMaximumConsecutive(int[] coins)
    {
        Arrays.sort(coins);
        int ans=0;
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i]<=(ans+1))
            {
                ans+=coins[i];
            }
            else
            {
                break;
            }

        }
        return ans+1;
    }
}