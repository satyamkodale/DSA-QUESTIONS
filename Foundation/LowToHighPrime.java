
package com.javadsa.Foundation;

import java.util.*;
public class LowToHighPrime {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound");
        int l=sc.nextInt();
        System.out.println("Enter the upper bound");
        int u=sc.nextInt();
     
        if(l==2)
        {
        System.out.println(l+"IS a prime Infinite" );
        l++;
        }
        else if(l%2==0)
        {
            l++;
        }
        
        for(int i=l; i<=u;i++)
        {
          
                   
            boolean flag=true;
              
            
            for(int j=2;j*j<=i;j++)
            {
               
                if(i%j==0)
                {
                    System.out.println(+i+"Not prime");
                    flag=false;
                    break;
                }
            
            }
             
            if(flag==true)
            {
                System.out.println(+i+" Is a Prime number ");
            }
           
            
        
        }
    
    }
    
}

// more less complexity it will only check for odd numbers
// if(l==2)
//        {
//        System.out.println(l+"IS a prime Infinite" );
//        l++;
//        }
//        else if(l%2==0)
//        {
//            l++;
//        }
//        
//        for(int i=l; i<=u;i=i+2)
//        {
//          
//                   
//            boolean flag=true;
//              
//             System.out.println(i-1+"Is not a prime");
//            for(int j=2;j*j<=i;j++)
//            {
//               
//                if(i%j==0)
//                {
//                    System.out.println(+i+"Not prime");
//                    flag=false;
//                    break;
//                }
//            
//            }
//             
//            if(flag==true)
//            {
//                System.out.println(+i+" Is a Prime number ");
//            }
//           
//            
//        
//        }
//    
//    }
//    