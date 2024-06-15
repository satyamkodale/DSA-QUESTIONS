/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;

/**
 *
 * @author Satyam
 */
import java.util.*;
 public class RelativeRanking {
    
    public static String[]  findRelativeRanks(int[] score) {
          int n = score.length;
        TreeMap<Integer, String> tmap= new TreeMap<>();
        String[] res= new String[n];
        for(int i=0;i<n;i++) {
            tmap.put(score[i],"");
        }
        int i=0;
        for(Map.Entry<Integer, String> entry : tmap.entrySet()) {
            if(n-i==1){
                tmap.put(entry.getKey(),"Gold Medal");
            }
            else if(n-i==2){
                tmap.put(entry.getKey(),"Silver Medal");
            }
            else if(n-i==3){
                tmap.put(entry.getKey(),"Bronze Medal");
            }
            else {
                tmap.put(entry.getKey(),Integer.toString(n-i));
            }
            i++;
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        i=0;
        for(int scr: score) {
            res[i++]=tmap.get(scr);
        }
        return res;
        

    }
    public static void main(String [] args)
    {
        int [] arr={10,3,8,9,4};
        
      findRelativeRanks(arr);
       

     
        
    }
    
}
