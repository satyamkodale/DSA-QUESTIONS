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
 * he count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.

For example, the saying and conversion for digit string "3322251":


Given a positive integer n, return the nth term of the count-and-say sequence.

 

Example 1:

Input: n = 1
Output: "1"
Explanation: This is the base case.
Example 2:

Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 * 
 *  public String countAndSay(int n) 
    {
       if(n==1) return "1";
       if(n==2) return "11";
       String string ="11";

       for(int i=3; i<=n; i++)
       {
           String temp="";
           int count=1;
           string+="&";
             
           for(int j=1; j<string.length(); j++)
           {
               if(string.charAt(j)!=string.charAt(j-1))
               {
                temp+=count;
                temp+=string.charAt(j-1);
                count=1;
               }
               else
               {
                   count++;
               }


           }
           string =temp;



       }
       return string;
    }
 */
public class Count_and_say {
    
}
