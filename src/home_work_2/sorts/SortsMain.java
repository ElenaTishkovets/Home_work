package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

/**
 * Задачи с сортировкой массивов
 */

public class SortsMain {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {9, 1, 5, 99, 9, 9};
        int[] arr4 = {};
        int[] arr5 = {6, 5, 4, 3, 2, 1};


        System.out.println("Массив до сортировки: " + Arrays.toString(arr1));
        SortsUtils.sort(arr1);
        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(arr1));
        SortsUtils.shake(arr1);
        System.out.println("Массив после шейкерной сортировки:" + Arrays.toString(arr1));
        System.out.println();


        System.out.println("Массив до сортировки: " + Arrays.toString(arr2));
        SortsUtils.sort(arr2);
        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(arr2));
        SortsUtils.shake(arr2);
        System.out.println("Массив после шейкерной сортировки:" + Arrays.toString(arr2));
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(arr3));
        SortsUtils.sort(arr3);
        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(arr3));
        SortsUtils.shake(arr3);
        System.out.println("Массив после шейкерной сортировки:" + Arrays.toString(arr3));
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(arr4));
        SortsUtils.sort(arr4);
        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(arr4));
        SortsUtils.shake(arr4);
        System.out.println("Массив после шейкерной сортировки:" + Arrays.toString(arr4));
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(arr5));
        SortsUtils.sort(arr5);
        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(arr5));
        SortsUtils.shake(arr5);
        System.out.println("Массив после шейкерной сортировки:" + Arrays.toString(arr5));
        System.out.println();

        int[] arr6 = ArraysUtils.arrayRandom(50, 100);
        System.out.println("Массив до сортировки: " + Arrays.toString(arr6));
        SortsUtils.sort(arr6);
        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(arr6));
        SortsUtils.shake(arr6);
        System.out.println("Массив после шейкерной сортировки:" + Arrays.toString(arr6));
        System.out.println();

        int [] arr7 = ArraysUtils.arrayFromConsole();
        System.out.println("Массив до сортировки: " + Arrays.toString(arr7));
        SortsUtils.sort(arr7);
        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(arr7));
        SortsUtils.shake(arr7);
        System.out.println("Массив после шейкерной сортировки:" + Arrays.toString(arr7));
        System.out.println();






    }
}
