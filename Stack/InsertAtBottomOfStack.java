package com.javadsa.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satyam
 */
import java.util.*;
class Solution5 {
    
   public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
     ins(st,x);
     return st;
    }
    static void ins(Stack<Integer> st,int x)
    {
        if(st.isEmpty())
        {
            st.push(x);
            return ;
        }
        int r=st.pop();
        ins(st,x);
        st.push(r);
        
        
    }
}
public class InsertAtBottomOfStack {
    
}
