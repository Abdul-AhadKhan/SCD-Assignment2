/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scd.assignment2;

/**
 *
 * @author Abdul Ahad
 * @param <T>
 */
public class GenericStack<T> {
    Node<T> head;
    int size;
    
    GenericStack(){
        head = null;
        size = 0;
    }
    
    void push(T data){
        
        Node<T> node = new Node();
        node.data = data;
        node.next = null;
        if (head == null){
            head = node;
            head.next = null;
            node.prev = null;
            head.prev = null;
        }
        else{
            Node<T> temp = head;
            head.next = node;
            node.prev = head;
            head = head.next;
            head.prev = temp;
            head.next = null;
        }
        size++;
    }
    
    void pop(){
        
        if (head == null){
            return;
        }
        else{
            Node<T> temp = head;
            head.prev.next = null;
            head = head.prev;
            head.next = null;
        }
    }
}
