
package com.javadsa.Foundation;

import java.util.*;
import java.math.*;
public class InverseOfNumber {
    public static void main(String [] args)
    {
      System.out.println("Enter a Number");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int count=0;
      int inversenum=0;

      
      
      while(num!=0)
      {
         int dig=num%10;
      
         num =num/10;
         count++;
         inversenum=inversenum+count*(int)Math.pow(10, dig-1);  
      
      }
      System.out.println(inversenum);
    
    }


}
    

