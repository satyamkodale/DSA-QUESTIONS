
package com.javadsa.Array.Easy;


public class FindMissingNumber1tonArray 
{
    public static void main(String [] args)
    {
       int n =10;
      int sumofNatural = ((n*(n+1))/2);
      System.out.println(sumofNatural);
      
      int[] arr={4,5,3,6,2,1,8,9,10};
      
      int sumofarr=0;
      for(int i=0; i<arr.length; i++)
      {
          sumofarr=sumofarr+arr[i];
      }
      
      int miss=sumofNatural-sumofarr;
      
      System.out.println("missing num is "+miss);
      
        
    }
    
}
