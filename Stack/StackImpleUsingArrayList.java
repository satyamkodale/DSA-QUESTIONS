/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Stack;

/**
 *
 * @author Satyam
 */
import java.util.*;



public class StackImpleUsingArrayList {
    
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
        Node(int data , Node next)
        {
        this.data=data;
        this.next=next;
        }
    }
    class StackImplByLL
    {
        public void push(int data)
        {
            Node node = new Node(data);
            if(head==null){
                head=node;
            }
            else
            {
             node.next= head;
              head=node;
            }
        }
        
        public int pop()
        {
            int value= head.data;
            head=head.next;
            return value;
        }
        
        public boolean isEmpty()
        {
          return head==null;
        }
        
        public int peek()
        {
           return head.data;
        }
        
        
        public void display()
        {
      Node temp =head;
      while(temp!=null){
          System.out.println(temp.data);
          temp=temp.next;
      }
      }
     
     
    }
    
     class StackImplByAl
    {
     ArrayList<Integer> al = new ArrayList<>();
     
     public boolean isEmpty()
     {
         return al.size()==0;
     } 
     public void push(int data)
     {
         al.add(data);
     }
     public int pop()
     {
        if(isEmpty()==true)
        {
            return -1;
        }
         int val = al.get(al.size()-1);
         al.remove(al.size()-1);
         return val;
     }
     public int peek()
     { return al.get(al.size()-1);
     }
     
     
     
    }
    
    public static void main(String [] arg)
    {
       
        //using arraylist
        StackImpleUsingArrayList.StackImplByAl s = new StackImpleUsingArrayList().new StackImplByAl();
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.al);
        
        s.push(5);
        
        System.out.println(s.al);
            s.pop();
        System.out.println(s.al);  
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

        System.out.println("====================================================");
        //using linkedlist 
        
        
          StackImpleUsingArrayList.StackImplByLL  l = new StackImpleUsingArrayList().new StackImplByLL();
          l.push(20);
          l.push(30);
          l.display();
          l.pop();
          l.display();
          System.out.println(l.peek());
          System.out.println(l.isEmpty());

    }
}
