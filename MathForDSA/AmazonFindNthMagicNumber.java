
package com.javadsa.MathForDSA;

import java.util.Scanner;


public class AmazonFindNthMagicNumber {
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        
//kunal's approch 
        
System.out.println("enter a number to convert in magic");
        int n =sc.nextInt();
        
        int magic=0;
        int base=5;
        
        //n>0
        while(!(n==0))
        {
            
            
            int last=n&1;
       
            magic+=last*base;
            base= base*5;  
            n=n>>1;
        
        }
        System.out.println(magic);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//my approch both time complexity is same 
        
//       
//        System.out.println("Enter a Number");
//        int num =sc.nextInt();
//        int numc=num;
//        System.out.println("In Which base do you want to convert");
//        int base =sc.nextInt();
//        int rmd=0;
//        int magic=0;
//        
//      
//        
//     for(int i=0;!(num==0);i++)
//     {
//          int r=num%base;
//         rmd+=((r)*Math.pow(10, i));
//         
//         magic+=((r)*Math.pow(5,i+1));
//        
//         
//         num=num/base;
//         
//     }
//     
//     System.out.println("your decimal number "+numc);
//     
//     System.out.println("Its base is  "+base+"Converted Number is"+rmd);
//     System.out.println("Magic number is "+magic);
    
    
    }
    
}
