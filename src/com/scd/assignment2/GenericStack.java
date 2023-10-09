/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scd.assignment2;
import java.util.EmptyStackException;

/**
 *
 * @author Abdul Ahad
 * @param <T>
 */
public class GenericStack<T> {
    private Node<T> head;
    private int size;
    
    GenericStack(){
        head = null;
        size = 0;
    }
    
    void push(T data){
        
        if (data == null){
            throw new IllegalArgumentException();
        }
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
        
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else{
            Node<T> temp = head;
//            head.prev.next = null;
            head = head.prev;
//            head.prev = head.prev.prev;
            if (head != null){
                head.next = null;
            }
            size--;
        }
    }
    
    boolean isEmpty(){
        
        return size == 0;
    }
    
    int size(){
        return size;
    }
    
    void print(){
        if (isEmpty())
            throw new EmptyStackException();
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

}
