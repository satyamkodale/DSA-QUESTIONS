
package com.javadsa.Foundation;

import java.util.Scanner;


public class LcmAndGcd {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("number num1");
        int num1=sc.nextInt();
        System.out.println("number num2");
        int num2=sc.nextInt();
        
        
        int rmd=1;
        int divisor;
        int divident;
   
        if(num1>num2)
            { 
                divisor=num2;
                 divident=num1;
           
            }
        else
        {
                 divisor=num1;
                 divident=num2;
        }


             
        while(rmd!=0)
        {
    
          
            rmd=divident%divisor;
        
            if(rmd>0){
            divident=divisor;
            divisor=rmd; }
            
            
        
        }
        
        int GCD=divisor;
        System.out.println(GCD+" is a GCD");
        int LCM=(num1*num2)/GCD;
        System.out.println(LCM+" is a LCM");
        
        
        
        
    }
    
}
