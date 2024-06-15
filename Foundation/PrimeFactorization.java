
package com.javadsa.Foundation;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[]args)
    {
        
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        //extra work for calculating lcm
        int lcm=1;
        
        for(int div=2; div*div<=number; div++)
        {
            while(number%div==0)
            {
                number=number/div;
                System.out.println(div);
                lcm=lcm*div;
            }
        
        }
        
        if(number!=1)
        {
            System.out.println(number);
        }
       
        
        System.out.println(lcm);
        
        
        
        
    }
    
}
