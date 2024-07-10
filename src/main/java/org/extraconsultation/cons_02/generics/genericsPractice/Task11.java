package org.extraconsultation.cons_02.generics.genericsPractice;

public class Task11 <T>{
    T obj;

    public Task11(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
