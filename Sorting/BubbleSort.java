/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Sorting;

/**
 *
 * @author Satyam
 */
public class BubbleSort 
{
    public static void bubbleSort(int [] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-(i+1); j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        
        }
        
//        for(int i = arr.length-1; i>=1; i--)
//        {
//            for(int j = 0; j<=i-1; j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
        
       for(int a : arr)
       {
       System.out.print(a+" ");
       }
    }
    
    public static void main(String[] args)
    {
        int arr[]={13,46,24,56,20,9};
        bubbleSort(arr);
    }
    
}
