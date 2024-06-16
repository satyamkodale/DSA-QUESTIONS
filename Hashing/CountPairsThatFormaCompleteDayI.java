/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Hashing;
import java.util.*;
/**
 *
 * @author Satyam
 */
public class CountPairsThatFormaCompleteDayI {
    
}
class Solution {
    public int countCompleteDayPairs(int[] hours) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int pairCount=0;
        for(int hour:hours)
        {
            int reminder= hour%24;
            if(reminder==0)
            {
                pairCount+= map.getOrDefault(0,0);  
            }
            else
            {
                pairCount+=map.getOrDefault(24-reminder,0);
            }
            map.put(reminder,map.getOrDefault(reminder,0)+1);
        }
        return pairCount;
    }
}