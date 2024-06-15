/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Queue;

/**
 *
 * @author Satyam
 */
import java.util.*;
public class Last_Stone_Weight {
    
    public static void main(String [] args)
    {
            PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(7);
        pq.add(1);
        pq.add(2);
        pq.add(8);
        pq.add(9);
        pq.add(-1);
        // Print elements in sorted order
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
            
        }


        
    
    }
}
