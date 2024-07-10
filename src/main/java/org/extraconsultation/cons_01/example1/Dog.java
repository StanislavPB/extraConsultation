package org.extraconsultation.cons_01.example1;

public class Dog {

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark(String message){
        System.out.println("Gav!" + message);
    }
}
