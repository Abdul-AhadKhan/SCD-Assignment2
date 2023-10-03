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
public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;
    Node(){
        data = null;
        next = null;
        prev = null;
    }
}

