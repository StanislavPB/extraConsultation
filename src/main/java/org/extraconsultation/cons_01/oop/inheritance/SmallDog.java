package org.extraconsultation.cons_01.oop.inheritance;

public class SmallDog extends Dog{

    private boolean isVisitGroomer;

    public SmallDog(String name, String breed, boolean isVisitGroomer) {
        super(name, breed);
        this.isVisitGroomer = isVisitGroomer;
    }

    public boolean isVisitGroomer() {
        return isVisitGroomer;
    }

    @Override
    public void voice(String message) {
        System.out.println(message);
        System.out.println("гав гав гав гав гав гав гав гав");
    }
}
