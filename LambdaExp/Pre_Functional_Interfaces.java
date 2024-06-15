/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.LambdaExp;

/**
 *
 * @author Satyam
 */

import java.util.function.*;

public class Pre_Functional_Interfaces {
    
    public static void main(String[] args)
    {
    
        //predicate<T>
       //test<t>
        
        String s=new String("Satyam");
        String k = new String("Kodale");
        Predicate<String> p1= (s1)->s1.length()>5;
        p1.test(s);
        Predicate<String> p2 = (k1)->k1.length()>5? true:k1.startsWith("K")?true:false;
          Predicate<String> p4= (s1)->s1.equals(k);
          p1.test(s);
        
        
        //Function
       //Function<T,R>
       //public R apply<T>
       
       Function<String, Integer> f1 = (string)->
       {
           System.out.println(string);
           return  string.length();
       };
       
       Function<String , Integer> f2 = (sk)->sk.length();
       f1.apply("satyam");
       
//       Function<Student,String> f = s->
//       {
//           int marks=s.marks;
//           String grade="";
//           if(marks>=80) grade ="a";
//           else if (marks>=60) grade="b";
//           else grade="c";
//           
//       }
        
        
    }
    
}
