/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Medium;

/**
 *
 Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 
 * 
 * 
 * for length 1,2,3 =3 their are 2^n subsets exits =2^3
 */
import java.util.*;


/// giving wrong output


//class Solution {
//    public List<List<Integer>> subsets(int[] nums)
//    {
//        int possibleCom=(int)Math.pow(2,nums.length);
//  
//        List<List<Integer>> list=new ArrayList<List<Integer>>();
//        // ArrayList<Integer>templist= new ArrayList<>();
//
//         for(int i=0; i<possibleCom; i++)
//         {
//             List<Integer> tempList =subset(i,nums.length,nums);
//             list.add(new ArrayList<>(tempList));
//
//         }
//
//         return list;
//    
//    }
//
//   private List<Integer> subset(int num,int length,int []nums)
//   {
//         ArrayList<Integer>tempList= new ArrayList<>();
//            int count=length-1;
//            int tempnum=num;
//            while(tempnum!=0)
//            {
//                int value=tempnum>>1;
//                if(value==1)
//                {
//                    tempList.add(nums[count]);
//                }
//                tempnum=tempnum>>1;
//                count--;
//
//            }
//
//            return tempList;
//
//   }
//    
//        
//        
//}

public class SubsetsOfArray {
    
   
    
    public static void main(String[] args)
    {
       
        
    }
    
}

// correct but for string 


//
//Sample Input
//3
//10
//20
//30
//Sample Output
//-	-	-	
//-	-	30	
//-	20	-	
//-	20	30	
//10	-	-	
//10	-	30	
//10	20	-	
//10	20	30	





//public class Main
//{
//
//public static void main(String[] args) throws Exception 
// {
//     
//    int possibleCom=Math.pow(2,arr.length-1);
//    
//    for(int i=0; i<possibleCom;i++)
//    {
//        String set="";
//        int temp=i;
//        
//        for(int j=arr.length-1;j>=0;j--)
//        {
//            int r =temp%2;
//            temp=temp/2;
//            
//            if(r==0)
//            {
//                set="-\t"+set;
//            }
//            else
//            {
//                set+=arr[j]+"\t"+set;
//            }
//            
//        }
//        System.out.println(set);
//    
//    }
//    
// 
// }
//
//}