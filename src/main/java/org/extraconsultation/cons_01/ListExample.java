package org.extraconsultation.cons_01;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        List strs = new ArrayList();

        strs.add("String");
        strs.add(1);
        strs.add(true);

        System.out.println(strs);

        for (int i = 0; i < strs.size(); i++) {
            System.out.println("" + (String) strs.get(i));
        }

    }
}
