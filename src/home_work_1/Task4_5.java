package home_work_1;
//4.5 Буква или иной символ

import java.util.Scanner;

public class Task4_5 {
    /**
     * Метод определяет является ли введенный символ буквой
     *
     * @param inputChar введенный символ
     * @return строку с указанием введена буква или иной символ
     */
    public String identifyChar(char inputChar) {

        if (inputChar >= 'A' && inputChar <= 'Z' || inputChar >= 'a' && inputChar <= 'z') {
            return "Это английский символ";
        } else if (inputChar >= 'А' && inputChar <= 'я' ||
                inputChar >= 'а' && inputChar <= 'я'
                || inputChar == 'Ё' || inputChar == 'ё') {
            return "Это русский символ";
        } else {
            return "Это иной символ";
        }
    }
}
