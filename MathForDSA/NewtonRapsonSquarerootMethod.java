
package com.javadsa.MathForDSA;

import java.util.*;
public class NewtonRapsonSquarerootMethod 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check the squre root by newton rapson");
        int num=sc.nextInt();
            
        
        System.out.println(sqrt(num));
    
}
    public static double sqrt(double num)
    { 
        double root;
            double x=num;
        while(true)
        {
            root=(x+(num/x))/2;
            if(Math.abs(root-x)<0.5)
            {
                break;
            }
            x=root;
            
            
        }
        return root;
        
    }
    
    
    }
    
