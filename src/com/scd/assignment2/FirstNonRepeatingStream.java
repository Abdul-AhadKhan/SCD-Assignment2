/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scd.assignment2;

/**
 *
 * @author Abdul Ahad
 */
public class FirstNonRepeatingStream {
    private Node<Character>[] nodes;
    private int[] letters;
    private Node<Character> head;
    private Node<Character> tail;
    private Node<Character> streamhead;
    private Node<Character> streamtail;
    private boolean[] removed;
    
    
    FirstNonRepeatingStream(){
        nodes = new Node[26];
        letters = new int[26];
        for (int i = 0; i < 26; i++)
            letters[i] = 0;
        removed = new boolean[26];
        for (int i = 0; i < 26; i++)
            removed[i] = false;
        head = null;
        tail = null;
        streamhead = null;
        streamtail = null;
    }
    
    void add(char data){
        
        if (data >= 'A' && data <= 'Z'){
            data += 32;
        }
        
        Node<Character> newnode = new Node<>();
        newnode.data = data;
        if (streamhead == null){
            streamhead = newnode;
            streamtail = newnode;
        }
        else{
            streamtail.next = newnode;
            newnode.prev = streamtail;
            streamtail = streamtail.next;
        }
        
        int index = (int)(data - 97);
        letters[index] += 1;
        
        if (letters[index] == 1){
            Node<Character> temp = new Node<>();
            temp.data = data;
            temp.next = null;
            if (head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                temp.prev = tail;
                tail = tail.next;
                
            }
            nodes[index] = temp;
        }
        else if (letters[index] > 1 && !removed[index]){
            
            Node<Character> tempPrev = nodes[index].prev;
            Node<Character> tempNext = nodes[index].next;
            Node<Character> current = nodes[index];
            
            if (current == head){
                head = head.next;
                if (head != null)
                    head.prev = null;
            }
            
            else if  (current == tail){
                tail = tail.prev;
                if (tail != null){
                    tail.next = null;
                }
            }
            else {
                tempPrev.next = tempNext;
                tempNext.prev = tempPrev;
                System.out.println(tempPrev.next + " " + tempNext.prev);
                System.out.println(tempPrev + " " + tempNext);
            }
            removed[index] = true;
        }
    }
    
    char getFirstNonRepeating(){
        
        if (head == null)
            return '-';
        else
            return head.data;
    }
    
    void print(){
        Node<Character> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            System.out.println(temp.prev + " " + temp.next + " " + temp);
            temp = temp.next;
        }
    }
}
