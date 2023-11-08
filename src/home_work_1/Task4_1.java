package home_work_1;

import java.util.InputMismatchException;
import java.util.Scanner;
 //4.1 Определить нечётное число

public class Task4_1 {

    /**
     * Метод определяет передано нечетное число или нет
     * @param number переданное число
     * @return true если число нечетное, false если число четное
     */
    public boolean determineOddNumber(int number) {
        return number % 2 == 1 || number % 2 == -1;
    }
}
