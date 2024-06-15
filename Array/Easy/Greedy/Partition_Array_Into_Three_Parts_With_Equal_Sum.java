/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy.Greedy;

/**
 *
 * @author Satyam
 * 
Method 2: 2 pointers greedy, credit to @D9night

Staring from the two ends of the input array, accumulate left and right parts till getting the average values;
If having found average values on both parts before the two pointers meet, return true; otherwise, return false.
 */
import java.util.*;
public class Partition_Array_Into_Three_Parts_With_Equal_Sum {
    public static void main(String [] args)
    {}
         public boolean canThreePartsEqualSum(int[] arr)
    {
        //gready
        int sum=Arrays.stream(arr).sum();
        int average= sum/3;
        if(sum%3!=0)
        {
            return false;
        }
        int l = 0, r = arr.length - 1;

        int leftSum = arr[l++],
        rightSum = arr[r--];
        do {
            if (leftSum != average)
                leftSum += arr[l++];
            if (l < r && rightSum != average)
                rightSum += arr[r--];
            if (l <= r && leftSum == average && rightSum == average)
                return true;
        } while (l < r);
        return false;
        
        //normal way 

        //  int sum = Arrays.stream(arr).sum();
        //  int  part = 0;
        //  int average = sum / 3;
        //  int  cnt = 0;

        // for (int a : arr) {
        //     part += a;
        //     if (part == average) { // find the average: sum / 3
        //         ++cnt; // find an average, increase the counter.
        //         part = 0; // reset part.
        //     }
        // }
        // return cnt >= 3 && sum % 3 == 0;
    }
    }
    

