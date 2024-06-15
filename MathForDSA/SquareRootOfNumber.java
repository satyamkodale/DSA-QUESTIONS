
package com.javadsa.MathForDSA;

import java.util.*;
public class SquareRootOfNumber 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1; i*i<=num; i++)
        {
            
            if(num%i==0)
            {
               if(num/i==i)
               {
               System.out.println(i);
               }
               else
               {
                    System.out.println(i+" ");
                    list.add(num/i);
               }
               
              
                
            }
           
 
        }
        
        for(int i=list.size()-1; i>=0; i--)
        {
            System.out.println(list.get(i));
        
        }
        
    
    }
    
}
