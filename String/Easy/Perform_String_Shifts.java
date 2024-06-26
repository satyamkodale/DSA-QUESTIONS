/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.String.Easy;

/**
 *
 * @author Satyam
 * 1427. Perform String Shifts
You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

direction can be 0 (for left shift) or 1 (for right shift). 
amount is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
Return the final string after all operations.

 

Example 1:

Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation: 
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"
Example 2:

Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
Output: "efgabcd"
Explanation: 
[1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
[1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
[0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
[1,3] means shift to right by 3. "abcdefg" -> "efgabcd"
 

Constraints:

1 <= s.length <= 100
s only contains lower case English letters.
1 <= shift.length <= 100
shift[i].length == 2
0 <= shift[i][0] <= 1
0 <= shift[i][1] <= 100
 */
public class Perform_String_Shifts
{
    public static String perfromShifts(String s, int [][] shifts)
    {
//        StringBuffer sf = new StringBuffer(s);
       
        for(int i=0; i<shifts.length; i++)
        {
            int dir=shifts[i][0];
            int by=shifts[i][1];
            
            if(s.length()%by==0)
            {
                System.out.println("by continue");
                continue;
            }
            else{
            if(dir==0)
            {
                //left shift
//                String endSub =sf.substring(0,by);
//                String startSub = sf.substring(by);
//                sf=new StringBuffer(startSub+endSub);
                
               s= s.substring(by)+s.substring(0,by);
            }
            else
            {
//                String startSub= sf.substring(sf.length()-by);
//                String endSub=sf.substring(0,sf.length()-by);
//                sf=new StringBuffer(startSub+endSub);
                
                s=s.substring(s.length()-by)+s.substring(0,s.length()-by);
                
            }
            }
            
        }
        
        return s;
        //return new String(sf);
    }
    public static void main(String [] args)
    {
        int arr [][] = {{0,7},{1,7}};
        String result = perfromShifts("fgabcde", arr);
        System.out.println(result);
        
    }
    
    
}
