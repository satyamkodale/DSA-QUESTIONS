/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Stack;

/**
 *
 * @author Satyam
 */
import java.util.*;
public class ReverseAStack {
    
      public static void printStack(Stack<Integer> st)
      {
         while(!st.isEmpty())
         {
             System.out.println(st.pop());
         
         }
      
          
      }
     static void pushAtBottom(Stack<Integer> st,int x)
    {
        if(st.isEmpty())
        {
            st.push(x);
            return ;
        }
        int r=st.pop();
        pushAtBottom(st,x);
        st.push(r);
    }
    
     static void reverseAStack(Stack<Integer> st)
     {
         if(st.isEmpty())
         {
         return;
         }
         
         int top = st.pop();
         reverseAStack(st);
         pushAtBottom(st,top);
         
     
     
     }
     
     public static void main(String[] args)
     {
     
         Stack<Integer> st = new Stack<>();
         st.push(1);
         st.push(2);
         st.push(3);
         //printStack(st);
         reverseAStack(st);
         System.out.println("called");
         printStack(st);
         
     
     }
}
