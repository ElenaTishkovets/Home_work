package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

/**
 * Перебор (итерирование) массива при помощи do....while, while, for, foreach
 */
public class ArraysIteration {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();

        printAllElements(array);
        printEverySecondElement(array);
        printReverseOrder(array);
    }

    /**
     * Вывод всех элементов массива
     * @param array
     */
    public static void printAllElements(int[] array) {
        System.out.println("Вывод всех элементов массива:");
        System.out.print("do...while: ");
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);

        System.out.print("\nwhile: ");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }

        System.out.print("\nfor: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nforeach: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Вывод каждого второго злемента массива
     * @param array
     */
    public static void printEverySecondElement(int[] array) {
        System.out.println("Вывод каждого второго элемента массива:");
        System.out.print("do...while: ");
        int i = 1;
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);

        System.out.print("\nwhile: ");
        i = 1;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2;
        }

        System.out.print("\nfor: ");
        for (i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nforeach: ");
        boolean print = false;
        for (int element : array) {
            if (print) {
                System.out.print(element + " ");
            }
            print = !print;
        }
        System.out.println();
    }

    /**
     * Вывод всех элементов массива в обратном порядке
     * @param array
     */
    public static void printReverseOrder(int[] array) {
        System.out.println("Вывод всех элементов массива в обратном порядке:");
        System.out.print("do...while: ");
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);

        System.out.print("\nwhile: ");
        i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }

        System.out.print("\nfor: ");
        for (i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nforeach: ");
        for (i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}


