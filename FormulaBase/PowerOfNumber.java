/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.FormulaBase;

import java.util.Scanner;

/**
 *
 * @author Satyam
 */
public class PowerOfNumber {
    
     public static void main(String [] args)
    {
        //optimized soln
               Scanner sc = new Scanner(System.in);
               System.out.println("enter number");
               double base=sc.nextInt();
               System.out.println("enter it's power");
               int pow=sc.nextInt();
               double ans=1;
               long npow =pow;
               
               
               
               if(npow<0)
                   npow=-1*npow;
               
               while(!(npow==0))
               {
                   if((npow&1)==1)
                   {
                      ans=ans*base;
                   }
                   base=base*base;
                   npow=npow>>1;
               
               }
               
               if(pow<0)
                   ans=(double)1/(double)ans;
               System.out.println(ans);
               
               
               
               
    //striver
    //   double ans =1.0;
    //   long nn = n;
    //   if(nn<0) 
    //     nn=-1*nn;
    //     while(!nn=0)
    //     {
    //         if(nn%2==0)
    //         {
    //             x=x*x;
    //             nn=nn/2;
    //         }
    //         else
    //         {
    //           ans=ans*x;
    //           nn=nn-1;
    //         }

    //     }

    //     if(n<0)
    //      ans=(double)1.0/(double)(ans);
    //     return ans;
        
        
        
        
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
