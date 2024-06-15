
package com.javadsa.Array.Easy;
import java.math.*;

public class LargestElement {
    
    
     //brute force
    //1st sort the array 
    //2nd at last index largest element present
    
    //optimal
    public static int Largest(int[] arr, int n)
    {
        int large=arr[0];
        for(int i =0; i<n;i++)
        {
        if(large<=arr[i])
        {
        large=arr[i];
        }
            
        }
        return large;
    }
    public static void main(String [] args){
        
        int [] arr= {3,4,2,5,10,6,8,7,9,1};
        int n =arr.length;
        System.out.println(Largest(arr,n));
        
    }
}
