/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy.Greedy;

/**
 *
 * @author Satyam
 * At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net transaction is that the customer pays $5.

Note that you do not have any change in hand at first.

Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.

 

Example 1:

Input: bills = [5,5,5,10,20]
Output: true
Explanation: 
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.
Example 2:

Input: bills = [5,5,10,10,20]
Output: false
Explanation: 
From the first two customers in order, we collect two $5 bills.
For the next two customers in order, we collect a $10 bill and give back a $5 bill.
For the last customer, we can not give the change of $15 back because we only have two $10 bills.
Since not every customer received the correct change, the answer is false.
 

Constraints:

1 <= bills.length <= 105
bills[i] is either 5, 10, or 20.
 * class Solution {
//     We use two variables fives and tens to keep track of the number of 5s and 10s we have. We initialize both of them to 0. We then iterate over the bills array and for each bill, we do the following:

// If the bill is of denomination 5, we increment the fives variable.
// If the bill is of denomination 10, we first check if we have at least one 5-dollar bill. If we don't have a 5-dollar bill, we can't give change, so we return false. If we have a 5-dollar bill, we decrement the fives variable and increment the tens variable.
// If the bill is of denomination 20, we first check if we have at least one 10-dollar bill and one 5-dollar bill. If we do, we decrement both the tens and fives variables. Otherwise, we check if
// we have at least three 5-dollar bills. If we do, we decrement the fives variable by 3. If we don't have enough bills to give change, we return false.
// At the end of the iteration, if we have not returned false, it means we were able to give change for all the bills and we can return true.
    public boolean lemonadeChange(int[] bills) 
    {
     int five = 0, ten = 0;
        for (int i : bills) {
            if (i == 5) five++;
            else if(i == 10) {five--; ten++;}
            else if(ten > 0 && five>=1){ ten--; five--;}
            else{five -= 3;}
            if (five < 0) return false;
        }
        return true;


        
        // optimal but lengthy 0(n) for both
        //     int fives=0;
        // int tens=0;
    //     for(int i: bills)
    //     {
    //         if(i==5)
    //         {
    //             fives++;
    //         }
    //         else if(i==10)
    //         {
              
    //             if(fives>=1)
    //             {
    //                 fives--;
    //                   tens++;
    //             }
    //             else
    //             {
    //                 return false;
    //             }
    //         }
    //         if(i==20)
    //         {
    //             if(fives>=1&&tens>=1)
    //             {
    //                 fives--;
    //                 tens--;
                    
    //             }
    //             else if(fives>=3)
    //             {
    //                 fives=fives-3;

    //             }
    //             else
    //             {
    //                 return false;
    //             }

    //         }

     
    //     }
    //     return true;

    // }
        
    }
}
 */
 public class  Lemonade_Change{
     public static void main(String [] args)
     {
    System.out.println(15%10);
     }
    
}
