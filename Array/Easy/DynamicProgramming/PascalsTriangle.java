/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy.DynamicProgramming;

/**
 *
 * @author Satyam
 */
import java.util.*;
public class PascalsTriangle {
    public static void main(String [] args){
//    
//    int i=0;
//    int j=1;
//    
//    List<Integer> list = new ArrayList<>();
//    
//    list.add(1);
//    list.add(4);
//    list.add(6); 
//    list.add(4);
//    list.add(1);
////    -----------------------------------
//    list.add(1);
//    list.add(list.get(i)+list.get(j));
//    i++;
//    j++;
//    list.add(list.get(i)+list.get(j));
//    i++;
//    j++;
//    list.add(list.get(i)+list.get(j));
//    i++;
//    j++;
//    list.add(list.get(i)+list.get(j));
//    list.add(1);
//    //_--------------------------------
//    
//    System.out.println(list);
//    
    
    
//   List<List<Integer>> listOfList = new ArrayList<>();
//   
//   List<Integer> list1 = new ArrayList<>();
//   list1.add(1);
//   list1.add(2);
//   list1.add(3);
//   listOfList.add(list1);
  
//   System.out.println(listOfList.get(0).get(0));

 List<List<Integer>> listOfList = new ArrayList<>();
 
 int noOfRows=5;
 
 
    for(int i=1; i<=noOfRows; i++)
   {
       int first=0;
       int second=1;
       List<Integer> temp = new ArrayList<>();
      
       for(int j=0; j<i; j++)         //0 1 2 3 4 5 
       {
           if(j==0||j==i-1)
           {
               temp.add(1);
           }
           else
           {
           temp.add(listOfList.get(i-2).get(first)+listOfList.get(i-2).get(second));
           first++;
           second++;
           }
       }
       
        listOfList.add(temp);
   }
   
   //1
   //11
   //121 -> 3   0 1 2  3-2
   //1331
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
    
    
    }

}
