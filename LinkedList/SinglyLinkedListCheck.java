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
public class SinglyLinkedListCheck {
    public static void main(String [] args)
    {
        SinglyLinkedList s= new SinglyLinkedList();
        s.insertAtFirst(4);
        s.insertAtFirst(3);
        s.insertAtFirst(2);
        s.insertAtFirst(1);
        s.display();
        s.insertAtLast(5);
        s.display();
        s.insertAtLast(6);
        s.display();
        s.insert(0,3);
        s.display();
        s.deleteAtFirst();
        s.display();
        s.deleteAtLast();
        s.display();
        s.delete(2);
        s.display();
        System.out.println(s.find(4));
        System.out.println(s.find(0));
        s.display();
        System.out.println(s.recurrsivefind(10));
         s.display();
        System.out.println(s.recurrsivefind(3));
        s.reverse();
        s.display();


    }
    
}
