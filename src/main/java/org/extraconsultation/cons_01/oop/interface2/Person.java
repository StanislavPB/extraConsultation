package org.extraconsultation.cons_01.oop.interface2;

public class Person implements Swimming{
    @Override
    public void swim() {
        System.out.println("Пловец кролем");
    }
}
