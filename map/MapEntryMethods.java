/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.map;

/**
 *
 * @author Satyam
 */
import java.util.*;

 public class MapEntryMethods {
    
     
    public static void findRelativeRanks(int[] score) {
        int n = score.length;
        TreeMap<Integer, Integer> tmap= new TreeMap<>();
        
        
        
        String[] res= new String[n];
        for(int i=0;i<n;i++) {
            tmap.put(score[i],i);
        }
        
        HashMap<Integer, Integer> Hashmap = new HashMap();
   
        
        
//        int i=0;
//        for(Map.Entry<Integer, Integer> entry : tmap.entrySet())
//        { System.out.println(entry.getKey()+" "+entry.getValue()); 
//           
//        }
        
        
        
        //printing keyset
        
        System.out.println("<---printing keyset--->") ;
        
        int i2=0;
        for( Integer i1 :tmap.keySet())
        {
            System.out.print(i1+"  for every key"+"-->");
            System.out.println(tmap.get(i1)+"   returning value of a key ");
            
        }
        
//         for every value 
        for(Integer i3 :tmap.values())
        {
           System.out.print(i3+"  for every value "+"-->");
           
        }
        
        

    }
    public static void main(String [] args)
    {
        int [] arr={10,3,8,9,4};
        
      findRelativeRanks(arr);
       

     
        
    }
    
}
