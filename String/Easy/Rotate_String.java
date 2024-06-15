/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.String.Easy;

/**
 *
 * @author Satyam
 * 
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
 
 * 
 * 
 * 
 *  Initially   s1 =  "abcde"
    Iteration1: s1 =  "bcdea"   (moving 'a' to righmost)
    Iteration2: s1 =  "cdeab"   (moving 'b' to righmost)
    After Iteration2, s1 equals s2.
    So, we will return true.
    * 
    * We observe that if we repeat the goal string twice then the start string is present inside it.
If we observe the above example carefully then:

    Initially s2 = "cdeab"
    After repeating s2 twice i.e., s2 = (s2 + s2), we get

    s2 = "cdeabcdeab"

    We find that s1 = "abcde" is present at index 3.
 */

import java.util.function.*;
public class Rotate_String {
    
   //s = "abcde", goal = "cdeab"
    
   // s = "abcde", goal = "abced"
    
    public boolean rotateString(String s, String goal) 
    {
        
        if(s.length()!=goal.length())
        {
            return false;
        }
        
        StringBuffer s1 = new StringBuffer(goal);
        s1.append(goal);
        
         if(s1.indexOf(s)!=-1)
         {return true;
         }
         else
         {
         return false;}
        
        
        
        
        
    }
    
    
    
    
}
