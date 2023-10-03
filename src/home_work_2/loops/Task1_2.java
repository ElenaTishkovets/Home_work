package home_work_2.loops;

import java.util.Scanner;

/**
 * Перемножение всех цифр введенного пользователем числа
 */

public class Task1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число");
        String numberFromConsole = console.next();

        if (isInteger(numberFromConsole)) {
            int[] array = getArray(numberFromConsole);
            String result = multiply(array);
            System.out.println(result);
        } else if (isNumeric(numberFromConsole)) {
            System.out.println("Введено не целое число");
        } else {
            System.out.println("Введено не число");
        }
    }

    /**
     * Проверка, является ли строка целым числом
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
     * Проверка, является ли строка числом (включая десятичные числа)
     */
    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * Преобразование строки с числом в массив
     */
    private static int[] getArray(String numberFromConsole) {
        int[] array = new int[numberFromConsole.length()];
        char[] digit = numberFromConsole.toCharArray();
        for (int i = 0; i < numberFromConsole.length(); i++) {
            if (Character.isDigit(digit[i])) {
                array[i] = Character.getNumericValue(digit[i]);
            } else {
                return new int[0]; // Возвращаем пустой массив в случае ошибки
            }
        }
        return array;
    }

    /**
     * Перемножение цифр из массива и вывод результата
     */
    private static String multiply(int[] array) {
        long result = 1L;
        StringBuilder stringBuilder = new StringBuilder();

        for (int digit : array) {
            result *= digit;
            stringBuilder.append(digit).append(" * ");
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 3); // Удаляем последний " * "
        }
        return stringBuilder.toString() + " = " + result;
    }
}

