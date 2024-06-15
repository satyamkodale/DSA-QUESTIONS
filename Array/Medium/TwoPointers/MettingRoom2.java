/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Medium.TwoPointers;

/**
 *
 * @author Satyam
 */

import java.util.*;
public class MettingRoom2 {
    
    public int checkA(int [][] meeting)
    {
        Arrays.sort(meeting ,new Comparator<int []>()
        {
           public int compare(int []a , int []b)
           {
               if(a[0]==b[0])
               {
               return a[1]-b[1];
               }
               return a[0]-b[0];
           
           }
        });
        
//        Arrays.sort(meeting,(a,b)->a[0]-b[0]);
     
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     pq.add(meeting[0][1]);
     int count=1;
    for(int i=1; i<meeting.length; i++)
    {
        if(pq.peek()<=meeting[i][0])
        {
            pq.poll();
          
        }
           pq.add(meeting[i][1]);
    
    }
        
        return pq.size();
    
    }
    
    public static void main(String [] args)
    {
    
    }
    
   
    
}
