package org.extraconsultation.cons_02.generics.generic3;

public class Circle <T extends Number> implements Figure{

    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius.doubleValue() * radius.doubleValue();
    }
}
