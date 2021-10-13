/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldapp;

/**
 *
 * @author quocbao
 */
    
import java.util.*; 
    
public class LinkedListTest {

    public static void main(String args[]) {
        LinkedList<String> ll
                = new LinkedList<>();

        ll.add("Tran");
        ll.add("Bauz");
        ll.add(1, "Quoc");

        // Using the Get method and the 
        // for loop 
        for (int i = 0; i < ll.size(); i++) {

            System.out.print(ll.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop 
        for (Object str : ll) {
            System.out.print(str + " ");
        }
    }
}
