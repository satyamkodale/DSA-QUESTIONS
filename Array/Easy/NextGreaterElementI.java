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
public class NextGreaterElementI 
{
    
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
//    {
//        
//        //if num1 and num2 are of same size
//        
//        Stack<Integer> helperStack = new Stack<>();
//         
//        int n1=nums1.length;
//        int n2= nums2.length;
//
//      HashMap hash = new HashMap();
//
//
//        int [] nextGreaterElements= new int[nums2.length];
//
//        for(int i=n2-1; i>=0; i--)
//        {
//           
//          int element=nums2[i];
//          //    if stack is empty
//          if(helperStack.isEmpty())
//          {
//            helperStack.push(element);
//            nextGreaterElements[i]=-1;
//            continue;
//           }
//
//           //if top of stack is greater--> its the next greatest
//           if(helperStack.peek()>element)
//           {
//              nextGreaterElements[i]=helperStack.peek();
//              helperStack.push(element);
//              continue;
//           }
//
//   
//           //if peek is small then to find greatest element
//           while(helperStack.peek()<= element && !helperStack.isEmpty())
//           {
//               helperStack.pop();
//           }
//           // while poping if gratest element not found 
//           if(helperStack.isEmpty())
//           {
//               nextGreaterElements[i]=-1;
//           }
//           else
//           {
//              nextGreaterElements[i]=helperStack.peek();
//           }
//           helperStack.push(element);
//
//
//
//        }
//        
            

    
    public int [] next(int [] nums1, int [] nums2)
    {
        Stack <Integer>st = new Stack<>();
        HashMap<Integer,Integer> hash = new HashMap<>();
        
        for(int num : nums2)
        {
            while(!st.isEmpty() && st.peek()< num)
            {
                hash.put(st.pop(),num);      
            }
            
            st.push(num);
        }
        
    
        
     return nums1;
    }
        
       
    
    public static void main(String [] args)
    {
      //if num1 and num2 are equal 
        
    
        
    }
    
}
