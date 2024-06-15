
package com.javadsa.Foundation;

import java.util.*;
public class ReverseNumber {
    public static void main(String [] args)
    {
        //1234
        System.out.println("Enter a Number");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
        int reverse=0;
        
        while(num!=0)
        {
            int dig = num%10;
            reverse = reverse*10+dig; 
            num =num/10;
        
        
        }
        
        System.out.println(reverse);
    
    }
    
}
