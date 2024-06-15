/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.String.Easy;

/**
 *
 * @author Satyam
 */
public class Shortest_Word_Distance_Leetcode {
    
    public int shortestDistance(String[] words, String word1, String word2)
    {
        int ps1=-1;
        int ps2=-1;
        int minDis=Integer.MAX_VALUE;
        for(int i=0; i<words.length; i++)
        {
           if(words[i].equals(word1))
           {
               ps1=i;
           
           }
           if(words[i].equals(word2))
           {
               ps2=i;
           
           }
           if(ps1!=-1&&ps2!=-1)
           {
               minDis=Math.min(minDis,Math.abs(ps1-ps2));
           
           }
           
           
        }
    
            return minDis;
    
    }
    
    
//my solution
    
//    public int findDistance(String s1, String s2, String[] Ms)
//    {
//       
//        int [] ind = {-1,-1};
//        boolean flag = false;
//        int lastIndex=Integer.MAX_VALUE;
//        int minDis=Integer.MAX_VALUE;
//        for(int i=0; i<Ms.length; i++)
//        {
//            if(Ms[i].equals(s1)||Ms[i].equals(s2))
//            {
//                  if(flag!=true)
//                  {
//                  flag=true;
//                   ind[0]=i;
//                   lastIndex=i;
//                  }
//                  else
//                  {
//                      if(minDis<Math.min(minDis, Math.abs(lastIndex-i))&&Ms[lastIndex]!=Ms[i])
//                      {
//                         minDis=Math.min(minDis, Math.abs(lastIndex-i));
//                          ind[0]=lastIndex;
//                          ind[1]=i;
//                          lastIndex=i;
//                      }else
//                      {
//                          lastIndex=i;
//                      }
//                  }
//            }
//            
//            if(ind[0]==-1||ind[1]==-1)
//            {
//                return -1;
//            }
//            return minDis;
//          
//            
//            
//            
//             
//        }
//        
               
            
            
        
       
    
}
