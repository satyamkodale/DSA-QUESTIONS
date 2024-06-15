
package com.javadsa.MathForDSA;

import java.util.Scanner;


public class NoOfDigitAtBaseB {
    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check digit at Base b");
        int num=sc.nextInt();
        System.out.println("Enter Base in which do you need the count of Digit");
        int base = sc.nextInt();
        
        int digitcount=(int)(Math.log(num)/Math.log(base))+1;
        
        System.out.println(digitcount);

        
    
        
    
    
    }
    
}
