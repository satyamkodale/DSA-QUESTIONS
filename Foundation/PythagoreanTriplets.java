
package com.javadsa.Foundation;

import java.util.Scanner;


public class PythagoreanTriplets 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 =sc.nextInt();
          System.out.println("Enter num2");
        int num2 =sc.nextInt();
          System.out.println("Enter num3");
        int num3 = sc.nextInt();
        //formula
//        num3 = (num1*num1)+(num2*num2); ==true then its a pythagorean triplet

//Best soln

int max=0;
boolean flag=false;
if(num1>=num2&&num1>=num3)
{
     max=num1;

}
if(num2>=num1&&num2>=num3)
{
     max=num2;

}
if(num3>=num1&&num3>=num2)
{
     max=num3;

}

System.out.println(max);
if(max==num1)
{
    flag=((num1*num1)==((num2*num2)+(num3*num3)));
    System.out.println("num1 is greatest and  triplate = "+flag);

}
else if(max==num2)
{
     flag=((num2*num2)==((num1*num1)+(num3*num3)));
       System.out.println("num2 is greatest and  triplate = "+flag);
}
else
{
    flag=((num3*num3)==((num1*num1)+(num2*num2)));
       System.out.println("num3 is greatest and  triplate = "+flag);

}


















// normal solution
//        int count=3;
//        boolean flag = true;
//        while(count!=0||flag==true)
//        {
//           int temp;
//            if((num3*num3)==(num1*num1)+(num2*num2))
//            {
//                System.out.println("is a triplate and num1="+num1+"num2"+num2+"num3"+num3);
//                System.out.println("at count"+count);
//                flag=false;
//                break;
//            }
//            if(count==2)
//            {
//                temp=num3;
//                num3=num1;
//                num1=temp;
//            
//            }
//            if(count==3){
//             temp=num3;
//            num3=num2;
//            num2=temp;
//            }
//            
//            
//            count--;
//               
//        }
//        
//      
        
        
    }
    
}
