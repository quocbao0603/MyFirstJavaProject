/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldapp;
import java.util.Queue;
import java.util.PriorityQueue;

/**
 *
 * @author quocbao
 */
public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
 
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(4);
        System.out.println("Queue: " + numbers);
 
        int accessedNumber = numbers.peek();
        System.out.println("Access: " + accessedNumber);
 
        
        int removedNumber = numbers.poll();
        System.out.println("Remove " + removedNumber);
 
        System.out.println("New Queue: " + numbers);
    }
}
