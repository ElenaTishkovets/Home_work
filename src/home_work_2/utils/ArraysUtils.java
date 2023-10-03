package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    /**
     * Формирование массива пользователем через консоль
     * @return массив
     */

    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = console.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = console.nextInt();
        }
        return array;
    }

    /**
     * Формирование массива из случайных чисел в заданном диапазоне
     * @param size  признак размера массива
     * @param maxValueExclusion признак верхняя граница диапазона, для формирования элементов массива
     * @return массив
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        Random rnd = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(maxValueExclusion);
        }
        return array;
    }
}
