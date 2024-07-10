package org.extraconsultation.cons_02.generics.generics.methods;

public class Calc {

    public void sum(int x, int y){
        System.out.println(x + y);
    }

    public <E> void mult(E x, E y){
        System.out.println(x);
    }
}
