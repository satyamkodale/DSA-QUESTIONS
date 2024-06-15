/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Recursion.Basic;

/**
 *
 * @author Satyam
 * 
 */
public class BasicStart {
    //when a fuction calls itself
    //until a specified condition is meet 
    // its called as recursion 
    
//    function calls it self and goes in recursion 
// to stop this we apply base condition 
//    public static void print()
//    {
//        System.out.println("hello");
//        print();
//        System.out.println("hii");
//    } 
    
    static int count=0;
    
    public static void print()
    {
        // this is base ocndition when this meets the program will stop
        if(count==4)
            return;
        System.out.println(count);
        count++;
        print();
    }
    public static void main(String [] args)
    {
        print();
//        output 
//        0
//        1
//        2
//        3
        

    }
    
}
