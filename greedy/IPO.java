/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.greedy;
import java.util.*;

/**
 *
 * @author Satyam
 */
public class IPO {
    
}


class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];
        
        // Create the projects array
        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }
        
        // Sort projects based on capital required (ascending)
        Arrays.sort(projects, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Max-heap to store the profits of the projects that can be started
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int current = 0;
        
        for (int i = 0; i < k; i++) {
            // Add all projects that can be started with current capital to the max-heap
            while (current < n && projects[current][0] <= w) {
                maxHeap.add(projects[current][1]);
                current++;
            }
            
            // If no project can be started, break
            if (maxHeap.isEmpty()) {
                break;
            }
            
            // Select the project with the maximum profit
            w += maxHeap.poll();
        }
        
        return w;
    }
}