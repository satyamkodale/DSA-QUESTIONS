/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;

/**
 *

 */
import java.util.*;

//optimal low code-->
//We are taking k as carry.
//We start from the last or lowest digit in array num add k.
//Then update k and move untill the highest digit.
//After traversing array if carry is > 0 then we add it to begining of num.
//
//Approach
//Example: `num` = [2,1,5], `k` = 806
//At index 2 num = [2, 1, 811] 
//So, `k` = 81 and `num` = [2, 1, 1]
//
//At index 1 num = [2, 82, 1]
//So, `k` = 8 and `num` = [2, 2, 1]
//
//At index 0 num = [10, 2, 1]
//So, `k` = 1 and `num` = [0, 2, 1]
//
//Now `k` > 0
//So, we add at the beginning of num
//`num` = [1, 0, 2, 1]


//logic to add in linked list at position 0-> if you add at 0 it will move current zero to 1
// 12340
// add we will get number like that 0 -> 4-> 3-> like this ;

//code
//public List<Integer> addToArrayForm(int[] num, int K) {
//    List<Integer> res = new LinkedList<>();
//    for (int i = num.length - 1; i >= 0; --i) {
//        res.add(0, (num[i] + K) % 10);
//        K = (num[i] + K) / 10;
//    }
//    while (K > 0) {
//        res.add(0, K % 10);
//        K /= 10;
//    }
//    return res;
//}



//my soln optimal-->
public class SumOfArray {
    class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
       

List<Integer> list = new ArrayList<>();

         int carry=0;
        for(int i=num.length-1; i>=0; i--)
        {
            
            int toAdd = num[i]+k%10+carry;
            k=k/10;
            if(toAdd>=10)
            {
                toAdd=toAdd-10;
                carry=1;
                list.add(toAdd);
            }
            else
            {
                carry=0;
                 list.add(toAdd);
            }

      

        }
      
        if(k!=0)
            {
                 while(k!=0)
                {
                    if(carry!=0)
                   {
                    int toAdd=k%10+carry;
                    k=k/10;
                    if(toAdd>=10)
                    {
                             toAdd=toAdd-10;
                           carry=1;
                          list.add(toAdd);

                    }
                    else{
                    list.add(toAdd);
                    carry=0;
                     }
                   }
                else
                   {
                   int toAdd=k%10;
                   list.add(toAdd);
                    k=k/10;
                  }
                }
            }
        if(carry!=0){
               
            list.add(carry);
            carry=0;
        }
    Collections.reverse(list);
    return list;
       
    }
}
    
}
