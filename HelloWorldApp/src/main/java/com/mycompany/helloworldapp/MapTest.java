/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldapp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author quocbao
 */
public class MapTest {
    public static void main(String args[]) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("One", "1");
        map.put("Five", "5");
        map.put("Four", "4");
        map.put("Two", "2");
        map.put("Three", "3");
        //unorder insertion
        System.out.println("HashMap: \n" + map);

        Map<String, String> map1 = new LinkedHashMap<String, String>();
        map1.put("One", "1");
        map1.put("Five", "5");
        map1.put("Four", "4");
        map1.put("Two", "2");
        map1.put("Three", "3");
        //order insertion
        System.out.println("LinkedHashMap: \n" + map1);
        //order by key
        Map<String, String> map2 = new TreeMap<String, String>();
        map2.put("1", "One");
        map2.put("5", "Fine");
        map2.put("4", "Four");
        map2.put("2", "Two");
        map2.put("3", "Three");
        System.out.println("TreeMap: \n" + map2);
    }
}
