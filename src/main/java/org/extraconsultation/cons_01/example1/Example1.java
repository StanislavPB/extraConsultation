package org.extraconsultation.cons_01.example1;

public class Example1 {
    public static void main(String[] args) {

        int x = 5;

        // ----------------

        String myString = new String("Моя строка");
       // абсолютно равноценна String myString = "Моя строка";

        Dog myDog = new Dog("Мухтар",3);

        System.out.println(myDog);

        System.out.println(myDog.name);

        myDog.bark("Овчарка");

    }
}
