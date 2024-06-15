
package com.javadsa.Array.Easy;

import java.util.*;

public class RotateArrayByKPlaces 
        
{
    // by brut force approch
    public static int [] rotate(int[] nums, int k) 
    {
         int n =nums.length;
           
       
          for(int i=0;i<k;i++){
          int temp=nums[n-1];
        for(int j=n-2;j>=0;j--)
        {
            
            nums[j+1]=nums[j];

        }
        nums[0]=temp;
        }
        return nums;
     
   }
    
    //optimal approch 
    
    public static int[] reverse(int[] arr,int  start , int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        
        }
        return arr;
    }
    
    public static int[] rotateArrayOptimal(int[] nums,int k)
    {
           int n = nums.length;
           k =k%n;//-->for edge cases if k is multiple of n ; or n is less than k  
        //for right roattion
        
           
            reverse(nums,0,n-1);
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
          
           //for left roations 

//           reverse(nums,0,k-1);
//           reverse(nums,k,n-1);
//           reverse(nums,0,n-1);
           
          return nums;
    }
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        int [] arr= {1,2,3,4,5,6,7,8,9,10};
//        int n =arr.length;
//        System.out.println("before rotation ");
//         for(int num:arr)
//        {
//            System.out.print(num+" ");
//        
//        }
//                  System.out.println("");
//
//         System.out.println("enter value of k");
//         int k =sc.nextInt();
//         
//        int[] rotated=rotate(arr,k);
//        System.out.println("after rotation by "+k);
//
//        for(int num:rotated)
//        {
//            System.out.print(num+" ");
//        
//        }
        
        Scanner sc = new Scanner(System.in);
        int [] arr= {1,2,3,4,5,6,7,8,9,10};
        int n =arr.length;
        System.out.println("before rotation ");
         for(int num:arr)
        {
            System.out.print(num+" ");
        
        }
        System.out.println("");

         System.out.println("enter value of k");
         int k =sc.nextInt();
         
        int[] rotated=rotateArrayOptimal(arr,k);
        System.out.println("after rotation by "+k);

        for(int num:rotated)
        {
            System.out.print(num+" ");
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
