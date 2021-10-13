/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldapp;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

/**
 *
 * @author quocbao
 */
public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
 
        // Chèn phần tử vào Queue bằng phương thức offer
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(4);
        System.out.println("Queue: " + numbers);
 
        // Truy cập phần tử trong Queue
        int accessedNumber = numbers.peek();
        System.out.println("Truy cập phần tử: " + accessedNumber);
 
        // Loại bỏ phần tử trong Queue
        int removedNumber = numbers.poll();
        System.out.println("Loại bỏ phần tử: " + removedNumber);
 
        System.out.println("Cập nhật Queue: " + numbers);
    }
}
