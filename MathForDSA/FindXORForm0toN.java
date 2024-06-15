
package com.javadsa.MathForDSA;

import java.util.*;
public class FindXORForm0toN {
    public static void main(String [] args)
    { 
//        if n=5=>0^1^2^3^4^5;
//        logic sequece is like this 
//        0-0
//        1-1
//        2-3
//        3-0
//        4-4
//        5-1
//        6-7
//        7-0
        
      
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to check its xor");
            int num =sc.nextInt();
            int xor=0;
            
            if(num%4==0)
            {
                xor=num;
                
            }
            else if(num%4==1)
            {
                xor=1;
            
            }
             else if(num%4==2)
            {
                xor=num+1;
            
            }
             else if(num%4==3)
            {
                xor=0;
            
            }
            
            System.out.println(xor);
            




//normal approch
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to check its xor");
//        int n=sc.nextInt();
//        int xorofnum=0;
//        for(int i=0; i<=n;i++)
//        {
//            xorofnum=xorofnum^i;
//        
//        }
//        System.out.println(xorofnum);
//    
//    
    }
    
}
