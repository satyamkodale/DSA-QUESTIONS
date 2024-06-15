/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.String.Medium;

/**
 *
 * @author Satyam
 */
import java.util.*;
class Solution {
    public List<Integer> partitionLabels(String s)
    {
        int [] alpha= new int[26];

        for(int i=0; i<s.length(); i++)
        {
            alpha[s.charAt(i)-'a']++;
        }
        List<Integer> list = new ArrayList<>();
        int sum=0;
        int var=0;
        for(int i=0; i<s.length(); i++)
        {
            if(alpha[s.charAt(i)-'a']>0)
            {
                sum=sum+(alpha[s.charAt(i)-'a']-1);
                alpha[s.charAt(i)-'a']=-1;
            }
            else if(alpha[s.charAt(i)-'a']==-1)
            {
                sum=sum-1;
            }
            if(sum==0)
            {
               
              list.add((i+1)-var);
               var=i+1;
            }
        }
        return list;
    }
}
public class Partition_Labels {
    
    
}
