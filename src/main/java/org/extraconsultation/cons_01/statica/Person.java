package org.extraconsultation.cons_01.statica;

public class Person {

    private String name;

    private static String town;

    public Person(String name, String town) {
        this.name = name;
        this.town = town;
    }

    public void printInfo(){
        System.out.println("Имя:" + name);
        System.out.println("Город:" + town);

    }

    public static void printInfoStatic(){
       // System.out.println("Имя:" + name); - НЕЛЬЗЯ В STATIC ИСПОЛЬЗОВАТЬ НЕ СТАТИЧЕСКИЕ ПЕРЕМЕННЫЕ
        System.out.println("Город:" + town);

    }

}
