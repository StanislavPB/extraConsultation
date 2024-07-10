package org.extraconsultation.cons_01.oop.inheritance.withoutInheritance;

public class SmallDog {
    private String name;
    private String breed;
    private boolean isVisitGroomer;

    public SmallDog(String name, String breed, boolean isVisitGroomer) {
        this.name = name;
        this.breed = breed;
        this.isVisitGroomer = isVisitGroomer;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isVisitGroomer() {
        return isVisitGroomer;
    }
    public void voice(String message){

    }

}
