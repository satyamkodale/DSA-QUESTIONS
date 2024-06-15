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
public class SelectionSort {
    public static void selectionSort(int [] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int minind=i;
            for(int j=i; j<arr.length;j++)
            {
                if(arr[minind]>arr[j])
                {
                    minind=j;
                }
            }
            int temp=arr[minind];
            arr[minind]=arr[i];
            arr[i]=temp;
        }
        for(int a: arr)
        {System.out.print(a+ " ");
        }
    }
    public static void main(String[] args)
    {
        int arr[]={13,46,24,56,20,9};
        selectionSort(arr);
    }
    
    
}
