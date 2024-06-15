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
public class CircularLinkedListCheck {
    
    public static void main(String [] args){
        CircularLinkedList cc = new CircularLinkedList();
        cc.insertAtLast(10);
        cc.insertAtLast(20);
        cc.insertAtLast(30);
        cc.insertAtLast(40);
        cc.display();
        cc.delete(30);
        cc.display();
        
    }
    
}
