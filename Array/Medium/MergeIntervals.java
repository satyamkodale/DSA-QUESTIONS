
package com.javadsa.Array.Medium;

/**
 *
 * @author Satyam
 */
import java.util.*;
public class MergeIntervals {
    class Solution {
    public int[][] merge(int[][] intervals) {

     List<int[]> result = new ArrayList<>();

    Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    //Arrays.sort(intervals,Comparator.compareInt((i)->i[0]));

    int [] newInterval = intervals[0];
    result.add(newInterval);

    for(int [] interval:intervals)
    {
        if(interval[0]<=newInterval[1])
        {
            //overlapping
            newInterval[1]= Math.max(newInterval[1],interval[1]);
        }
        else
        {
            //disjoint 
        newInterval=interval;
        result.add(newInterval);
        }
    }

    return result.toArray(new int[result.size()][]);

       
    }
}
    public static void main(String [] args)
    {
        
        
    
    
    }
    
}
