/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;


public class MoveAllZeroToEnd {
       public static int[] moveZeros(int n, int []a)
         {  
             int i=0;
             int j=1;
             
              while(j<n)
              {
                  if(a[i]==0)
                  {
                      if(a[j]!=0)
                      {
                         int temp=a[i];
                          a[i]=a[j];
                          a[j]=temp;
                           i++;
                      }
                  }
                  else
                  {
                      i++;
                  }
                  j++;

              }

      return a;
        }
    
}
