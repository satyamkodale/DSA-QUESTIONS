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
import java.util.*;
import java.util.stream.Collectors;

interface Lambda
{
public int m1(int a);
}
public class LambdaExp {
    
    public static void main(String [] args)
    {
        Function<Integer,Integer> f=i->i*i;
        System.out.println(f.apply(5));
        
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(7));
        
        
        
        List<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(10);
        list1.add(80);
        list1.add(50);
        list1.add(30);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1,(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
        System.out.println(list1);
        
        list1.forEach(i1->{System.out.println(i1);});
        
        List<Integer> l1 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l1);
        
        
       // ArrayList<Emp> al = new ArrayList<>();
       //al.add(new Emp("saksham",197024));
       //al.add(new Emp("satyam",197026)); 
      // Collections.sort(al,(emp1,emp2)->(emp1.id>emp2.id)?-1:(emp1.id<emp2.id)?1:0);
      //descending
      //[("satyam",197026),("saksham",197024)];
      //Collections.sort(al,(emp1,emp2)->-emp1.name.compareTo(emp2.name));
      
      
  
       Runnable r= ()->{
              for(int i=0; i<10; i++)
              {
                  System.out.println(i+"by child");
              }
              };
        
         Thread t = new Thread(r);
         t.start();
          for(int i=0; i<10; i++)
              {
                  System.out.println(i+"by main");
              }
         
         
        Lambda l = (i)-> {
            System.out.println("square is");
            return i*i;
        };
        l.m1(10);
    
        
        
    
    }
}
