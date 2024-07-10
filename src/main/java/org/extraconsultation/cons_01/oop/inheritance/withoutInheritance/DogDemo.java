package org.extraconsultation.cons_01.oop.inheritance.withoutInheritance;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Zeus", "Cane corso");

        dog.voice("наша собака громко лает на дверь");

        BigDog bigDog = new BigDog("Zeus","cane corso", true);

        SmallDog smallDog = new SmallDog("Gera","Shiatsu", true);

        Dog[] dogs = new Dog[5];

        BigDog[] bigDogs = new BigDog[3];
        SmallDog[] smallDogs = new SmallDog[2];


    }
}

