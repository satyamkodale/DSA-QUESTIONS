/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.String.Easy;

/**
 *
 * @author Satyam
 * 205. Isomorphic Strings
Solved
Easy
Topics
Companies
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 */
public class Isomorphic_Strings {
     public boolean isIsomorphic(String s, String t)
    {
   
   // most optimal 
           if(s.length() != t.length())
            return false;
             int[] map1 = new int [256];
             int []map2 = new int [256];

            for(int i =0; i<s.length(); i++)
            {
                if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                  return false;

                map1[s.charAt(i)]=i+1;
                map2[t.charAt(i)]=i+1;

            }
        
return true;
    }


//optimal 
//          if(s.length() != t.length())
//            return false;
//        
//
//     Map<Character,Character> map1 = new HashMap<>(s.length());
//     Map<Character,Boolean> map2 = new HashMap<>(s.length());
//     for(int i=0; i<s.length(); i++)
//       {
//           char char1 = s.charAt(i);
//           char char2 = t.charAt(i);
//
//           if(map1.containsKey(char1)==true)
//           {
//                 if(map1.get(char1)!=char2)
//                 {
//                     return false;
//                 }
//                 else 
//                 {
//                     if(map2.containsKey(char2)==true)
//                       {   
//                           return false;     
//                       }
//                       else
//                       {
//                           map1.put(char1,char2);
//                           map2.put(char2,true);
//                       }
//                 }
//           }
//         
//       }
//
//       return true;
//
//
//
//
//
//
//
//
//
//
//
//





        // Map<Character,Character> hash = new HashMap<>(s.length());
        // for(int i=0; i<s.length(); i++)
        // {
        //     if(!hash.containsKey(s.charAt(i)))
        //     {
        //         for(Character c :hash.values())
        //         {
        //             if(c.equals(t.charAt(i)))
        //             {
        //                 return false;
        //             }
        //         }

        //        hash.put(s.charAt(i),t.charAt(i));
        //     }
        //     else
        //     {
        //         Character value =hash.get(s.charAt(i));
        //          if(!value.equals(t.charAt(i)))
        //          {
        //              return false;
        //          }
                
                
        //     }

        // }
        
        // return true;
    
    public static void main(String [] args)
    {
    
        
        
    }
}
