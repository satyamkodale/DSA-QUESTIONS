/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Medium;

/**
 *
 * @author Satyam
 */
import java.util.*;

public class FactorialOfALargeNumber {

    public static void main(String[] args) {

        LinkedList<Integer> li = new LinkedList<>();
        int num = 8;
         li.add(1);
    for(int i=2; i<=num; i++)
    {
        
        int lisize = li.size()-1;
        int carry=0;
        for(int j=lisize; j>=0; j--)
        {
            int ele = li.get(j);
            
            int multi=i*ele+carry;
            carry=0;
            int toSet=multi%10;
            carry+=multi/10;
            li.set(j, toSet);
            
            System.out.println(j+"for"+i);
            
        }
        
        while(carry!=0)
        {
            System.out.println("enterd");
            int toSet=carry%10;
            li.add(0, toSet);
            carry=carry/10;
        
        }
    }
    
    System.out.println(li);
}
    
}