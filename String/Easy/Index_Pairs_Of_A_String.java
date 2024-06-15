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
 * Given a text string and words (a list of strings), return all index pairs [i, j] so that the substring text[i]...text[j] is in the list of words.

 

Example 1:

Input: text = "thestoryofleetcodeandme", words = ["story","fleet","leetcode"]
Output: [[3,7],[9,13],[10,17]]
Example 2:

Input: text = "ababa", words = ["aba","ab"]
Output: [[0,1],[0,2],[2,3],[2,4]]
Explanation: 
Notice that matches can overlap, see "aba" is found in [0,2] and [2,4].

* All strings contains only lowercase English letters.
It's guaranteed that all strings in words are different.
1 <= text.length <= 100
1 <= words.length <= 20
1 <= words[i].length <= 50
Return the pairs [i,j] in sorted order (i.e. sort them by their first coordinate in case of ties sort them by their second coordinate).
 */
import java.util.*;
public class Index_Pairs_Of_A_String {
    
    public static void main(String [] args){
        //test case1 
        // String text = new String("thestoryofleetcodeandme");
         String text = new String("ababa");
                 
        List<String> words = new ArrayList<>();
        
//        test case1 
//words.add("story");
//words.add("fleet");
//words.add("leetcode");

words.add("aba");
words.add("ab");
         List<int[]> indexPairsList = new ArrayList<int[]>();
          for (String word : words)
          {
            int wordLength = word.length();
              int curIndex = 0;
              while(curIndex >= 0)
              {
                   curIndex = text.indexOf(word, curIndex);
                    if (curIndex >= 0)
                    {
                    indexPairsList.add(new int[]{curIndex, curIndex + wordLength - 1});
                    curIndex++;
                    }
              }
              
          }
        
          Collections.sort(indexPairsList, new Comparator<int[]>() {
            public int compare(int[] array1, int[] array2) {
                if (array1[0] != array2[0])
                    return array1[0] - array2[0];
                else
                    return array1[1] - array2[1];
            }
        });

        int length = indexPairsList.size();
        int[][] indexPairs = new int[length][2];
        for(int i=0; i<length; i++)
        {
            int [] list = indexPairsList.get(i);
            indexPairs[i][0]= list[0];
            indexPairs[i][1]= list[1];
            
        }
          
       
      for(int [] a:indexPairsList)
     {
         for(int a1 :a)
         {
         System.out.println(a1);
         }
     }
          
        
    
    }
   }
// String s = new String("thestoryofleetcodeandme");
//    boolean b = s.contains("satya");
//    System.out.println(b);
//   System.out.println( s.indexOf("satya", 0));
//   
//   StringBuffer bf = new StringBuffer("satyam");
//   
//List<String> words = new ArrayList<>();
//words.add("story");
//words.add("fleet");
//words.add("leetcode");
//   
//   List<int []> list = new ArrayList<>();
//   for(int i=0; i<words.size(); i++)
//   {
//       
//       for(int j=0; j<s.length();)
//       {
//          
//           int index =s.indexOf(words.get(i),j);
//           
//           if(index!=-1){
//           int [] array = new int [2];
//           array[0]=index;
//           array[1]=index+words.get(i).length()-1;
//           list.add(array);
//           
//           j=j+(index+1);
//           
//           }
//           else
//           {
//               break;
//           }
//           
//           
//       }
//       
//     for(int [] a:list)
//     {
//         for(int a1 :a)
//         {
//         System.out.println(a1);
//         }
//     }
//   }
//    
//    }
    
