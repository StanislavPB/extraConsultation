package org.extraconsultation.cons_02.functionalInterfaces.useFI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("DD");
        strings.add("FFF");
        strings.add("AAA");
        strings.add("CC");
        strings.add("BBBBBBB");
        strings.add("E");
        strings.add("HHHHHHHHHH");

        System.out.println(strings);
//        Collections.sort(strings);
//        System.out.println(strings);


        // STEP 1

//        StringLengthComparator comparator = new StringLengthComparator();
//        Collections.sort(strings,comparator);
//        System.out.println(strings);

        // STEP 2

//        Collections.sort(strings, new StringLengthComparator());
//        System.out.println(strings);


        // STEP 3 -
        // используя анонимный класс мы можем не создавать StringLengthComparator

        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        };

        Collections.sort(strings, myComparator);
        System.out.println(strings);

    }
}
