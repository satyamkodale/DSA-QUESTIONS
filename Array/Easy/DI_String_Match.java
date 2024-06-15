/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;

/**
 *
 * @author Satyam
 * 
 * A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

 

Example 1:

Input: s = "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: s = "III"
Output: [0,1,2,3]
Example 3:

Input: s = "DDI"
Output: [3,2,0,1]
 

Constraints:

1 <= s.length <= 105
s[i] is either 'I' or 'D'.
 * 
 
 */
public class DI_String_Match {
    
    
     public int[] diStringMatch(String s) {
        
        int [] result = new int [s.length()+1];

        int i=0;
        int d=s.length();

        for(int p=0; p<s.length(); p++)
        {
            if(s.charAt(p)=='I')
            {
                result[p]=i;
                i++;
            }
            else
            {
               result[p]=d; 
               d--;
            }
        }
        result[result.length-1]=i;
        return result;
        
    }
    
    public static void main(String [] args)
    {
        
    
    }
    
}
