/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.String.Easy;

/**
 *
 * @author Satyam
 */


public class StringAndStringBufferAndStringBuilder 
{
    public static void main(String [] args)
    {
    
        
//String 
        String s1=new String("Satyam");
        String s2=new String("Satyam");
        
        System.out.println(s1.equals(s2)+" Content Comparison");
        System.out.println(s1==s2 +"refernce comparison Comparison");
        
        //methods
        
        String d = new String("raisoni");
        char c =d.charAt(0);
        
        for(int i=0; i<d.length(); i++)
        {
            System.out.println(d.charAt(i));
        }
        
        String d1 = d.concat("college");
        System.out.println(d1);
        
        System.out.println(s1.equals(s2)+" Content Comparison case sensitive ");
        
        System.out.println(s1.equalsIgnoreCase(s2) +"Content Comparison not   case sensitive");
        
        System.out.println(d1.isEmpty()+"empty or not ");
        System.out.println(d1.length()+"length of string ");
         
        String d2 = new String("aaaaaaa");
        System.out.println(d2.replace('a', 'c'));
        
        System.out.println(d2.indexOf('a'));
        System.out.println(d2.indexOf('a', 2));
        
        System.out.println(d2.lastIndexOf('a'));
        System.out.println(d2.toLowerCase());
        System.out.println(d2.toUpperCase());
        System.out.println(d2.substring(3));
        System.out.println(d2.substring(3,4));
        
        System.out.println(d2.trim());
        
     
       System.out.println(d2.compareTo(s2)+"comparision by compare to");
        System.out.println(d2.contains("aa")+"contains");
       
        
        
      
//String Buffer 
        
        StringBuffer s3=new StringBuffer("Satyam");
        StringBuffer s4=new StringBuffer("Satyam");
        
        System.out.println(s3.equals(s4)+" refernce comparison Comparison Both");
        System.out.println(s3==s4);
        
        String s = new String(s3);
        System.out.println(s);
        
        StringBuffer s5=new StringBuffer(s);
        System.out.println(s5);
        
        
        //methods
        StringBuffer b1 = new StringBuffer("satyam");
        System.out.println(b1.capacity()+"capacity");
        b1.append("kodale");
        System.out.println(b1);
        b1.insert(2, 's');
        
          System.out.println(b1);
          b1.replace(0, 2,"ss" );
           System.out.println(b1);
           
          b1.replace(2, 3, "a");
          System.out.println(b1);
          
          b1.deleteCharAt(0);
            System.out.println(b1);
            
            b1.reverse();
                System.out.println(b1);
             b1.reverse();
             System.out.println(b1);
             
             b1.setLength(6);
             System.out.println(b1);
             
             b1.setCharAt(0, 'k');
               System.out.println(b1);

                     
        
        
        
    }
    
}
