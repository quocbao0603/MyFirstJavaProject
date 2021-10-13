/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldapp;


/**
 *
 * @author quocbao
 */

import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;

public class PriorityBlockingQueue {
    public static void main(String args[])
    {
        // Creating empty priority
        // blocking queue
        Queue<Integer> pbq
            = new PriorityBlockingQueue<Integer>();
  
        // Adding items to the pbq
        // using add()
        pbq.add(10);
        pbq.add(20);
        pbq.add(15);
  
        // Printing the top element of
        // the PriorityBlockingQueue
        System.out.println(pbq.peek());
  
        // Printing the top element and
        // removing it from the
        // PriorityBlockingQueue
        System.out.println(pbq.poll());
  
        // Printing the top element again
        System.out.println(pbq.peek());
    }
}
