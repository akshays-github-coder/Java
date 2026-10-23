package com.cwa.java8.methodReferences;

public class Methods {

    static void square(int n) {
        System.out.println(n*n);
    }

    void print(String msg){
        System.out.println(msg);
    }

    Methods(){
        System.out.println("Methods object created");
    }
}
