package org.extraconsultation.cons_02.generics.generics.classes;

public class BoxForPaper {
    Paper item;

    public BoxForPaper(Paper item) {
        this.item = item;
    }

    public Paper getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "BoxForPaper{" +
                "item=" + item +
                '}';
    }
}
