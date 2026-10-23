package com.cwa.java8.methodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferences {

    public static void main(String[] args) {

        // Reference link: https://www.geeksforgeeks.org/java/java-method-references/
        System.out.println("***4 Types of Method References***\n");

        System.out.println("\n***Reference to a Static Method***");
        List<Integer> list = Arrays.asList(2, 3, 4);
        list.forEach(Methods::square); // passes each list element to the square() method
        // Internally, this works like:
        //list.forEach(n -> Methods.square(n));

        System.out.println("\n***Reference to an Instance Method of a Particular Object***");
        Methods methods = new Methods(); // methods is an object of the Methods class.
        List<String> data = Arrays.asList("Java", "Spring", "Boot");
        data.forEach(methods::print); // methods::print refers to the instance method print().
        // Each element of the list is automatically passed to print().
        // Equivalent lambda expression:
        // data.forEach(msg -> methods.print(msg));

        System.out.println("\n***Reference to an Instance Method of an Arbitrary Object***");
        List<String> names = Arrays.asList("\njava", "spring", "microservice");
        names.stream()
                // String::toUpperCase calls toUpperCase() on each String object.
                // map() transforms each element into uppercase.
                .map(String::toUpperCase)
                // System.out::println prints the transformed values.
                .forEach(System.out::println);
        // Equivalent lambda expression:
        // map(name -> name.toUpperCase())

        System.out.println("\n***Reference to a Constructor***");
        Supplier<Methods> methodsSupplier = Methods::new;   // Supplier<Student> is a functional interface with get() method.
        // Student::new refers to the constructor of Student.
        methodsSupplier.get();  // When supplier.get() is called, a new Student object is created.
        // Equivalent lambda expression:
        //Supplier<Methods> methodsSupplier = () -> new Methods();
    }
}
