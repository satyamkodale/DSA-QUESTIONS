/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.String.Easy;

/**
 *
 * @author Satyam
 * In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.

 

Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
Example 2:

Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
Example 3:

Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) 
* According to lexicographical rules "apple" > "app", because 'l' > '∅',
* where '∅' is defined as the blank character which is less than any other character (More info).
 */

public class VerifyingAn_Alien_Dictionary
{
    public boolean isAlienSorted(String[] words, String order)
    {
        int alien[] = new int[26];
        for(int i = 0; i < order.length(); i++)
        {
            alien[order.charAt(i)-'a']= i;
        }
        for(int i =1; i < words.length; i++)
        {
            if(!compare(words[i-1], words[i], alien))
            {
                return false;
            }
        }
        return true;
    }

    Boolean compare(String s , String t, int[] alien)
    {
        int i =0;
        while(i < s.length() && i < t.length())
        {
            if(s.charAt(i) == t.charAt(i))
            {
                i++;
            }
            else if(alien[s.charAt(i)-'a'] < alien[t.charAt(i)-'a'])
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        if(s.length() > t.length())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
}
