package org.extraconsultation.cons_01.statica;

public class PersonDemo {
    public static void main(String[] args) {

        Person personPetr = new Person("Petr","Berlin");
        personPetr.printInfo();

        Person personOlga = new Person("Olga","Leipzig");
        personOlga.printInfo();


        personPetr.printInfo();

        Person personJames = new Person("James", "London");

        Person.printInfoStatic();


//        Math.min(5,3);
    }
}
