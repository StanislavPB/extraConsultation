package org.extraconsultation.cons_01.oop.inheritance;

public class BigDog extends Dog{

    private boolean isProtectedDiploma;

    public BigDog(String name, String breed, boolean isProtectedDiploma) {
        super(name, breed);
        this.isProtectedDiploma = isProtectedDiploma;
    }

    public boolean isProtectedDiploma() {
        return isProtectedDiploma;
    }

   @Override
    public void voice(String message) {
        super.voice(message);
    }
}
