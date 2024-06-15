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
public class InsertionSort {
    public static void insertionSort(int [] arr)
    {
        
        for(int i=0; i<arr.length; i++)
        {
            int j =i;
            while(j>0&&arr[j-1]>arr[j])
            {
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        
        
        
        
        
        
        //mine code 
//        for(int i=1; i<arr.length;i++)
//        {
//            if(arr[i-1]>arr[i])
//            {
//                int j=i-1;
//                int k=i;
//                while(j>=0&&arr[k]<arr[j])
//                {
//                    int temp = arr[j];
//                    arr[j]=arr[k];
//                    arr[k]=temp;
//                    j--;
//                    k--;
//                }
//            }
//        }
        
        for(int a: arr)
        {System.out.print(a+ " ");
        }
    }
    public static void main(String[] args)
    {
        int arr[]={13,46,24,56,20,9};
        insertionSort(arr);
    }
}
