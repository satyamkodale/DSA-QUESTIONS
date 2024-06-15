
package com.javadsa.MathForDSA;

import java.util.*;
public class SquarerootOfANumber
{
    //optimized
    public static void main(String[]arg)
    {
             Scanner sc = new Scanner(System.in);
             System.out.println("enter a number to check");
               int num=sc.nextInt();
              // perfectSquare(num);
              System.out.println("place value");
               int p=sc.nextInt();
               boolean  flag=false;
               int iroot=0;
               double finalroot =0.0;
                
               
               for(int i=1; i*i<=num;i++)
               {
                   if(i*i==num){
                       System.out.println(i+"  Is a root");
                       finalroot=i;
                     flag=true;
                       break;
                   }
                   iroot=i; 
               }
             
               if(flag==false)
               {
                   finalroot=iroot;
                   System.out.println(iroot);
                   double dec=0.1;
               
               for(int i=0; i<p; i++)
               {
                   while(finalroot*finalroot<=num)
                   {
                       finalroot+=dec;
                   }
                   finalroot-=dec;
                   dec=dec/10;
               
               }
          
               }
               
                    System.out.println("final root is "+finalroot);
               

        
        
    }
}
        
