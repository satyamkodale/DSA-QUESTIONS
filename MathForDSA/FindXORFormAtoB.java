
package com.javadsa.MathForDSA;
import java.util.*;
public class FindXORFormAtoB {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        
        int xor=xorf(b)^xorf(a-1);
        System.out.println(xor);
        
    }
    
    public static int xorf(int n)
    {
        if(n%4==0)
        {
            return n;
        }
         if(n%4==1)
        {
            return 1;
        } if(n%4==2)
        {
            return n+1;
        }
        if(n%4==3)
        {
            return 0;
        }
    
        return 0;
    }
    
}
