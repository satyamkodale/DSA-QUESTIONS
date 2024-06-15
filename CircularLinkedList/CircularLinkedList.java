/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.CircularLinkedList;

/**
 *
 * @author Satyam
 */
public class CircularLinkedList {
    
    Node head;
    Node tail;
 
    
    
    class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
        Node(int val , Node next)
        {
            this.val= val;
            this.next = next;
        }
    
    }
    
    public void insertAtLast(int val)
    {
        
        Node node =  new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
                 
             return ;
             

        }
      
        tail.next=node;
        node.next=head;
        tail=node; 
    }
    
    public void display()
    {
    
        Node temp = head;
      
       if(head!=null)
       {
       
           do
           {
           System.out.print(temp.val+"->");
           temp=temp.next;
           
           }while(temp!=head);
       }
        System.out.println("END");


    }
    
    
    public void delete(int val)
    {
        if(head==null){
            return;
        }
        
        Node node = head;
        
        if(node.val==val)
        {
            head = head.next;
            tail.next=head;
            return;
        }
        
       do
       {
           Node n= node.next;
           if(n.val==val)
           {
           node.next=n.next;
           }
           node=node.next;
       
       }while(node!=head);
        
    }
    
    
    
}
