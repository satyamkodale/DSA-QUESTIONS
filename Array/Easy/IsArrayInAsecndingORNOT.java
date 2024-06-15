/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;


public class IsArrayInAsecndingORNOT 
{
    public static int checkAsec(int[] arr,int n)
    {
        for(int i=0; i<n-1;i++)
        {
            if(n==1)
            {
                return 1;
            }
            if(arr[i]>arr[i+1])
            {
                return 0;
            }
            
        }
        return 1;
        
    }
     public static void main(String [] args){
        
        int [] arr= {1,2,3,4,5,6,7,8,9,10};
        int n =arr.length;
        System.out.println(n);
      System.out.println(checkAsec(arr,n));
                

        
        
        
  
        
        
    }
    
}
