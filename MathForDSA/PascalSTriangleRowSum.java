
package com.javadsa.MathForDSA;

import java.util.Scanner;
public class PascalSTriangleRowSum {
    public static void main(String [] args)
    {
        //passal triangle rule to find the sum of row is row staring from 0--n and sum of row is 2^row number 
        
         Scanner sc = new Scanner(System.in);
       System.out.println("Enter the row number do you want to calculate sum");
       int rowno=sc.nextInt();
       //we know that a<<b operator a*2^b;
        //here we need only 2^(rowno-1) so simply keep a=1;
        int rowsum=1<<(rowno-1);
        System.out.println("Sum of the Row is "+rowsum);
       
       
       
        //my code high complexity
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the row number do you want to calculate sum");
//        
//        int row=sc.nextInt();
//        
//        int sum=(int)Math.pow(2,row-1);
//        System.out.println("Sum of a row no. "+row+" is = "+sum);
//        
                
        
    }
    
}
