package org.extraconsultation.cons_01.oop.inheritance.withoutInheritance;

public class BigDog {
    private String name;
    private String breed;
    private boolean isProtectedDiploma;

    public BigDog(String name, String breed, boolean isProtectedDiploma) {
        this.name = name;
        this.breed = breed;
        this.isProtectedDiploma = isProtectedDiploma;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isProtectedDiploma() {
        return isProtectedDiploma;
    }

    public void voice(String message){

    }
}
