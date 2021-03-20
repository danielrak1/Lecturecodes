package com.coding;

import com.coding.objects.Person;

import static java.lang.Math.PI;


public class Main {

    // Our first program in Java: Hello World
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person aPersonOutOfObjectsPackage = new Person();
       // aPersonOutOfObjectsPackage.age = 10; // age has default access modifier
       
        System.out.println(PI);
        System.out.println(Math.round(PI));
    }
    
    
}
