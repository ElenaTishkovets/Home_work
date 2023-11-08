package home_work_1;

import java.util.Scanner;

//4.6 Определить високосный год или нет
public class Task4_6 {

    /**
     * Метод определяет является ли год високосным
     *
     * @param inputYear год, введенный пользователем
     * @return true - если год високосный, false - если год не високосный
     */
    public boolean checkLeapYear(int inputYear) {
        if (((inputYear % 4 == 0) && (inputYear % 100 != 0)) || (inputYear % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}