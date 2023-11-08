package home_work_2.loops;

import home_work_2.utils.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

// * 1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
// * 		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
// * 		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
// * 		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

public class Task1_2 {

    /**
     * Метод проверяет переденное значение
     * @param data переданное значение
     * @return  результат перемножения символов введеного значения, либо сообщает об ошибке в случае некорректного значения
     */
    public static String myltiplyChar (String data) {
        if (isInteger(data)) {
            int[] array = getArray(data);
            String result = multiply(array);
            return result;
        } else if (isNumeric(data)) {
            return "Введено не целое число";
        } else {
            return "Введено не число";
        }
    }

    /**
     * Метод переводит переданное значение в целое число
     * @param str  переданное значение
     * @return целое число
     */
    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Метод проверяет переданное значение на недопустимые символы
     * @param str переданное значение
     * @return  true если находит символ, false если не находит символ
     */
    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * Метод преобразовывает строку в целое число
     * @param data переданное значение
     * @return массив целых чисел
     */
    private static int[] getArray(String data) {
        int[] array = new int[data.length()];
        char[] item = data.toCharArray();
        int dataLength = data.length();
        for (int i = 0; i < dataLength; i++) {
            if (Character.isDigit(item[i])) {
                array[i] = Character.getNumericValue(item[i]);
            } else {
                return new int[0]; // Возвращаем пустой массив в случае ошибки
            }
        }
        return array;
    }

    /**
     * Перемножение цифр из массива и вывод результата
     */
    /**
     * Метод перемножает элементы переданного массива
     * @param array массив
     * @return строку в виде всех элементов переданного значения с результатом перемножения
     */
    private static String multiply(int[] array) {
        long result = 1L;
        StringBuilder stringBuilder = new StringBuilder();

        for (int item : array) {
            result *= item;
            stringBuilder.append(item).append(" * ");
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 3); // Удаляем последний " * "
        }
        return stringBuilder.toString() + " = " + result;
    }
}
