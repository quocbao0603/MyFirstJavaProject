/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldapp;

import java.util.ArrayList;

/**
 *
 * @author quocbao
 */

public class ArrayListTest {
    public static void main(String[] args) {
        int n = 5;
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
//        for (Object var : arrList) {
//            System.out.print(var + " ");
//        }
    }
}
