/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.DoublyLinkedList;

/**
 *
 * @author Satyam
 */
public class DoublyLinkedList 
{
    private Node head;
//    private Node tail;
    
//    private int size;
    
    
    class Node
    {
        private int val;
        private int data;
        Node prev;
        Node next;
        
        Node ()
        {
        }
        Node(int value)
        {
            this.val=value;
            
        }
        Node(int val , Node next,Node prev)
        {
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
        
    }
    
    public void insertAtFirst(int val)
    {
    Node node = new Node(val);
    node.next=head;
    
//    head.prev=node;--> null pointer exception 
    if(head!=null)
   {
     head.prev=node;
    }
    head=node;
    
    }
    
    
    
    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null)
        {
            System.out.print(temp.val+ " ->");
            last = temp;
            temp=temp.next; 
         
        }
         System.out.println("END");
        while(last!=null)
        {
           System.out.print(last.val+ " ->");
           last=last.prev;
        }
        System.out.println("START");

    }
    
    
    public void insertAtLast(int val)
    {
        Node node = new Node(val);
        Node last = head;
        node.next=null;
        if(head==null)
        {
            head=node;
            return;
            
        }
        while(last.next!=null)
        {
          last=last.next;
        }
          last.next=node;
          node.prev=last;
        

    
    }
    
    
   public Node find(int value)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.val==value)
            {
                return temp;
            }
            temp=temp.next;
        }
        
        return null;
            
    }
   
   public void insertAtAfter(int after, int val){
   
       Node prev = find(after);
       if(prev==null)
       {
           System.out.println("doesnt exits");
       }
       Node node = new Node(val);
       
       node.next=prev.next;
       prev.next=node;
       node.prev=prev;
       if(node.next!=null){
       node.next.prev=node;
       }
       
       
   }
    
    
    
}
