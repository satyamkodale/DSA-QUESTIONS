/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;

public class ReverseAnArray 
{
    public static int [] reverse(int [] arr, int n)
    {
        int start=0;
        int end=n-1;
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
    
    public static void reverseByMid(int [] arr,int n,int mid)
    {
        
        for(int i=0; i<mid; i++)
        {
          
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        
        System.out.println("reverse of array via mid");
        for(int num:arr)
        {
        System.out.print(num+" ");
        }
    
    }
     public static void main(String [] args){
        
        int [] arr= {3,4,2,5,10,6,8,7,9,1,11};
        
        int n =arr.length;
        int end=n;
        int start=0;
        
        int mid=start+(end-start)/2;
        
        System.out.println(arr[mid]+" is mid ");
        
        int[] reversed = reverse(arr,n);
        for(int num:reversed)
        {
            System.out.print(num+" ");
        }
                System.out.println("");

        System.out.println("=================================================");
        int [] arr2= {1,2,3,4,5,6,7,8,9,10,11}; 
         int n2 =arr2.length;
         int mid2=start+(end-start)/2;
        reverseByMid(arr2,n2,mid2);
        
       
        
        
        
        
        
    }
    
    
}
