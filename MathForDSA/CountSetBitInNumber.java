
package com.javadsa.MathForDSA;
import java.util.*;
public class CountSetBitInNumber 
{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number to  Count  set bit of a Number ");

    
    int num=sc.nextInt();
    int count=0;
    while(!(num==0))
    {
        num=num-(num&(-num));

        count++;
    
    }
    System.out.println(count);
    
//        while(!(num==0))
//    {
//        num=(num&(num-1));
//
//        count++;
//    
//    }
//    System.out.println(count);
//    
    
    
    
//        System.out.println("Enter a number to  Count  set bit of a Number ");
//    int num= sc.nextInt();
//    int count=0;
//
//    while(!(num==0))
//    {
//        if((num&1)==1)
//        {
//            count++;
//            
//        }
//        
//        num=num>>1;
//    
//    }
//    
//    System.out.println("Count of a set bit in a Number is = "+count);
//   
    }
    
}
