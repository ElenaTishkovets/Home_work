package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

/**
 * Вывод в консоль сформированного пользователем массива
 */
public class Task2_1_1 {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        System.out.println("Массив, введенный с консоли: " + Arrays.toString(container));
    }
}
