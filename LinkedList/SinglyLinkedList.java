/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.LinkedList;

/**
 *
 * @author Satyam
 */
public class SinglyLinkedList {
    
    private Node head;
    private Node tail;
    private int size;
    SinglyLinkedList()
    {
        this.size=0;
    }
    
    class Node
    {
       private  int value;
       private Node next;
    
        Node(int value)
        {
            this.value=value;
        }
        Node(int value , Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
    
    //Insertion at first 
    public void insertAtFirst(int value)
    {
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
        System.out.println("head ->"+head.value);
       System.out.println("tail -> "+tail.value);

    }
    
    //display 
    
    public void display()
    {
        Node temp = head;
        
        while(temp!=null)
        {
            System.out.print(temp.value +"->");
            temp=temp.next;
        }
    
       System.out.println("END");
       
        System.out.println("head ->"+head.value);
       System.out.println("tail->"+tail.value);

       
    }
    
    
    public void insertAtLast(int val)
    {
        
        if(tail==null)
        {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        //tail operation 
        tail.next=node;
        tail=node;
        size++;
        System.out.println("head ->"+head.value);
       System.out.println("tail ->"+tail.value);

    }    
    
    public void insert(int val,int index)
    {
        if(index==0){
            insertAtFirst(val);
            return;
        }
        if(index==size){
            insertAtLast(val);
            return;
        }
        
        Node temp=head;
        for(int i=1; i<index; i++)
        {
            temp=temp.next;
        } 
        
//        Node newNode = new Node(val);      
//        newNode.next=temp.next;
         Node newNode= new Node(val,temp.next);
         temp.next=newNode;
        size++;
        
         System.out.println("head ->"+head.value);
       System.out.println("tail ->"+tail.value);


    
    }
    
    
    public int deleteAtFirst()
    {
       
      int val = head.value;
      head=head.next;
      if(head==null)
      {
           tail=null;
      }
      size--;
           System.out.println("head ->"+head.value);
       System.out.println("tail ->"+tail.value);

      return val;
      
        
    }
    
    public int deleteAtLast()
    {
        if(head.next==null)
        {
            return deleteAtFirst();
        }
        
        Node secondLast= get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
         System.out.println("head ->"+head.value+" delete at last ");
       System.out.println("tail-> "+tail.value+" delete at last ");
        return val;
    }
       
    
    public Node find(int value)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.value==value)
            {
                return temp;
            }
            temp=temp.next;
        }
        
        
       System.out.println("head ->"+head.value+" found ");
       System.out.println("tail ->"+tail.value+" founnd ");
        return null;
        
           
    }
    public int recurrsiveHelper(Node head,int key)
    {
      //        basecase
        if(head==null)
        {
            return -1;
        }
        if(head.value==key){
            return 0;
        }
        int response =recurrsiveHelper(head.next,key);
        if(response==-1)
        {
            return -1;
        }
        return response+1;
 
    }
    
    public int recurrsivefind(int key)
    {
    return recurrsiveHelper(head,key);
    }
    public Node get(int index)
    {
        Node temp = head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
       System.out.println("head ->"+head.value+" get ");
       System.out.println("tail ->"+tail.value+" get ");
        return temp;
        
           
    }
    
 
    
    public int delete(int index)
    {
        if(index==0)
        {
            return deleteAtFirst();
        }
        if(index==size-1)
        {
            return deleteAtLast();
        }
        
        
        Node prev= get(index-1);
        int val = prev.next.value;
        
        prev.next=prev.next.next;
        return val;
        
        
//        Node temp = head;
//        for(int i=1; i<index; i++)
//        {
//            temp=temp.next;
//        }
//        
//        int val = temp.next.value;
//        temp.next=temp.next.next;
//      return val;
    }
    
    
    public void reverse()
    {
        Node prev = null;
        Node curr=head;
        Node tail=head;
        Node next;
        
        while(curr!=null)
        {
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
        }
        head=prev;
    
    }
}
