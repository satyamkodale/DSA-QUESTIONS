
package com.javadsa.Array.Easy;

public class LeftRotateAnArrayByOne {
     static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
           int temp=arr[0];
           for(int i=1;i<n;i++)
           {
               arr[i-1]=arr[i];
             
           }
           arr[n-1]=temp;

           return arr;

    }
    public static void main(String [] args)
    {
       
        int [] arr= {3,4,2,5,10,6,8,7,9,1};
        int n =arr.length;
     int [] rotated= rotateArray(arr,n);
          for(int num:rotated)
          {
              System.out.print(num);
              
          }
        
        
    
    }
}
