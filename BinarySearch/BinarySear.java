/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.BinarySearch;

/**
 *
 * @author Satyam
 */
public class BinarySear {
    
    
    public static int binary(int [] arr, int target)
    {
        int start =0;
        int end = arr.length-1;
        
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target){return mid;}
            else if(arr[mid]<target)
            {
                start=mid+1;
            }     
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
        }
        return -1;
    
     
    }
    
    
    public static boolean binarySearch(int [] arr,int start, int end,int target)
    {
        int mid = (start+end)/2;
        if(arr[mid]==target){return true;}
        if(start<end){
        if(arr[mid]<target)
        {
            binarySearch(arr,mid+1,end,target);
        }
        else
        {
                 binarySearch(arr,start,mid-1,target);
        }
        }
        else
        {
            return false;
        }
        
        
        return false;
        
    }
    
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8};
         System.out.println(binarySearch(arr,0,arr.length-1,9));
         System.out.println(binary(arr,3));
    }
    
}
