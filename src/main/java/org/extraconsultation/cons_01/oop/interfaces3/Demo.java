package org.extraconsultation.cons_01.oop.interfaces3;

public class Demo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();
        Eagle eagle = new Eagle();

        Flying[] flyings = {eagle,duck};

        Swimming[] swimmings = {duck,fish};
    }
}
