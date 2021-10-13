/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldapp;

/**
 *
 * @author quocbao
 */
class Singleton {

    //private constructor protect "new" a instance
    private static Singleton instanceSingleton;

    private Singleton() {
    }

    ;

public static Singleton getInstance() {
        if (instanceSingleton == null) {
            instanceSingleton = new Singleton();
        }
        return instanceSingleton;
    }
}

public class SingletonTest {

    public static void main(String[] args) {
        Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();
        //Singleton single = new Singleton(); //error bc we protect constructor
        if (single1.equals(single2)) {
            System.out.println("Unique Object");
        } else {
            System.out.println("Not unique");
        }
    }
}
