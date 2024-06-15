/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Medium;

/**
 *
 * @author Satyam
 * 
 * Example 1:
Input:
 arr = [4, 7, 1, 0]
Output:
 7 1 0
Explanation:
 Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

Example 2:
Input:
 arr = [10, 22, 12, 3, 0, 6]
Output:
 22 12 6
Explanation:
 6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.

Practice:
Solve Pro
 * import java.util.*;

class TUF{

public static ArrayList<Integer> 
                     printLeadersBruteForce(int[] arr, int n){
    
  ArrayList<Integer> ans= new ArrayList<>();
  
   // Last element of an array is always a leader,
   // push into ans array.
   int max = arr[n - 1];

    ans.add(arr[n-1]);
    
    // Start checking from the end whether a number is greater
    // than max no. from right, hence leader.
    for (int i = n - 2; i >= 0; i--)
      if (arr[i] > max) {
        ans.add(arr[i]);
        max = arr[i];
      }

  return ans;
   
}

public static void main(String args[]) 
{
  // Array Initialization.
  int n = 6;
  int arr[]=  {10, 22, 12, 3, 0, 6};


  ArrayList<Integer> ans= printLeadersBruteForce(arr,n);
  
  Collections.sort(ans, Collections.reverseOrder());
  
  for (int i = 0; i < ans.size(); i++) {
    System.out.print(ans.get(i)+" ");
  }

}
}

Output:

22 12 6
 */
import java.util.*;
public class Superior_Elements_Array {
    
    //  //leetcode similar problem
//    1299. Replace Elements with Greatest Element on Right Side
//Easy
//2.4K
//233
//Companies
//Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
//
//After doing so, return the array.
//
// 
//
//Example 1:
//
//Input: arr = [17,18,5,4,6,1]
//Output: [18,6,6,6,1,-1]
//Explanation: 
//- index 0 --> the greatest element to the right of index 0 is index 1 (18).
//- index 1 --> the greatest element to the right of index 1 is index 4 (6).
//- index 2 --> the greatest element to the right of index 2 is index 4 (6).
//- index 3 --> the greatest element to the right of index 3 is index 4 (6).
//- index 4 --> the greatest element to the right of index 4 is index 5 (1).
//- index 5 --> there are no elements to the right of index 5, so we put -1.
//Example 2:
     public int[] replaceElements(int[] arr) {
        int  n= arr.length;
        int max=arr[n-1];
       

        int result[]= new int [arr.length];
         result[n-1]=-1;

        for(int i=n-2; i>=0; i--){
             if(arr[i]>max)
             {
           
               result[i]=max;
               max=arr[i];

             }
             else
             {
                 result[i]=max;
             }

        }
        return  result;

        
        
    }
    public static void main(String [] args)
    {
      
        

    }
    
}
