/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Medium.SlidingWindow;

/**
 *
 * @author Satyam
 * This question is a good example where simply '
 * finding a way to reword it would make your life 
 * a lot easier. The question is asking us to find
 * the maximum sum of values at the left and right edges 
 * of the array. More specifically, it's asking us to find
 * the max sum of k values at the edges. If we were to reword
 * the question, we're essentially asked to find the minimum subarray 
 * sum of length n - k. Once we find this, we simply subtract this from the total sum and this would be our answer.
 */

class Solution {
    public int maxScore(int[] cardsPoints, int k)
    {
        int totalSum=0;
        int minSum=0;
        int curSum=0;
        int target=cardsPoints.length-k;
        for(int i=0; i<target; i++)
        {
            curSum+=cardsPoints[i];
            totalSum+=cardsPoints[i];
        }
        minSum=curSum;
        int j=0;
        for(int i=target; i<cardsPoints.length; i++)
        {
            totalSum+=cardsPoints[i];
            curSum+=cardsPoints[i];
            curSum-=cardsPoints[j];
            j++;
            minSum=Math.min(curSum,minSum);
           
        }

        return totalSum-minSum;
       

      
    }
}
public class Maximum_Points_You_Can_Obtain_from_Cards {
    
 public int maxScore(int[] cardPoints, int k) {
     
	int n = cardPoints.length, totalSum = 0, minSubarray = 0;

	for (int i=0, currSum=0; i<n; i++) {
		totalSum += cardPoints[i];
		currSum += cardPoints[i];
		if (i < n-k) 
                    minSubarray += cardPoints[i];
		else {
			currSum -= cardPoints[i-(n-k)];
			minSubarray = Math.min(minSubarray, currSum);
		}
	}

	return totalSum - minSubarray;
} 
    }
    
    

