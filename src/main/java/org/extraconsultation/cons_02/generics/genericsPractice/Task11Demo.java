package org.extraconsultation.cons_02.generics.genericsPractice;

public class Task11Demo {

    public static void main(String[] args) {

        Task11<Integer> test1 = new Task11<>(15);
        System.out.println(test1.getObj());

        Task11<String> test2 = new Task11<>("Java");
        System.out.println(test2.getObj());
    }

}
