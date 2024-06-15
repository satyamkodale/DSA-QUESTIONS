
package com.javadsa.MathForDSA;

import java.util.Scanner;


public class PowerOfANumber 
{
    public static void main(String [] args)
    {
        //optimized soln
               Scanner sc = new Scanner(System.in);
               System.out.println("enter number");
               int base=sc.nextInt();
               System.out.println("enter it's power");
               int pow=sc.nextInt();
               int ans=1;
           
               
               while(!(pow==0))
               {
                   if((pow&1)==1)
                   {
                      ans=ans*base;
                   }
                   base=base*base;
                   pow=pow>>1;
               
               }
               System.out.println(ans);
               
               
               
               
        
        
        
        
//        normal way to calculate the power of number

//        System.out.println("enter number");
//          int num1 = sc.nextInt();
//        System.out.println("enter it's power");
//          int pow1 = sc.nextInt();
//          
//          
//          
//        int ans1=1;
//       for(int i=pow1;i>=1;i--)
//       {
//           ans1=ans1*num1;
//      
//       }
//       System.out.println(ans1);
//       System.out.println("By (double)Math.pow"+Math.pow(num,pow));
//        
//    
    
    }
    
}
