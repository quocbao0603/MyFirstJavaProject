/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldapp;

import java.util.*;

/**
 *
 * @author quocbao
 */

public class ArrayListTest {
    public static void main(String[] args) {
        /*int n = 5;
        ArrayList<Integer> arrList = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i++) {
            arrList.add(i);
        }
        System.out.println(arrList);
        arrList.remove(3);
        
        System.out.println(arrList);
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        */
        /*
        int entry = 10;
        arrList.remove(entry);
        //it is calling the .remove(int) which removes the index, not the object value.
        for (Object var : arrList) {
            System.out.print(var + " ");
        }
        */
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add(1, "Python");
        System.out.println("Value of index = 2 la: " + list.get(2));
 
        Iterator<String> itr = list.iterator();
        System.out.println("Iterator from 0..n - 1");
        while (itr.hasNext()){
            Object element = itr.next();
            System.out.println("\t" + element);
        }
        
        /*ListIterator<String> itr = list.listIterator();
        System.out.println("Iterator form 0 -> n - 1:");
        while (itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
        System.out.println("Iterator form n - 1 -> 0:");
        while (itr.hasPrevious()) {
            System.out.println("\t" + itr.previous());
        }
        */
    }
}
