package org.extraconsultation.cons_02.exception;

import org.extraconsultation.cons_02.standartFunctionalInterfaces.UserInput;

public class Example1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        int x = ui.inputInteger("Введите первое число");
        int y = ui.inputInteger("Введите второе число");

        System.out.println("результат деления: " + divide(x, y));
        System.out.println("Программа завершила свою работу");

    }

    static double divide(int x, int y){
        return x / y;
    }
}
