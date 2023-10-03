package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Random;

/**
 * Задачи с массивами
 */
public class Task2_4 {
    public static void main(String[] args) {

        int[] array = ArraysUtils.arrayRandom(50, 100);

        int sum = sumEvenElements(array);
        System.out.println("Сумма четных положительных элементов: " + sum);

        int maxEvenIndex = maxElement(array);
        int maxEvenValue = array[maxEvenIndex];
        System.out.println("Максимальный элемент с четным индексом: " + maxEvenValue);


        double average = calculateAverage(array);
        int[] elementsLessThanAverage = getElementsLessThanAverage(array, average);
        System.out.print("Элементы меньше среднего арифметического: ");
        for (int element : elementsLessThanAverage) {
            System.out.print(element + " ");
        }
        System.out.println();


        int[] smallestElements = findTwoSmallest(array);
        System.out.println("Наименьший элемент: " + smallestElements[0]);
        System.out.println("Второй наименьший элемент: " + smallestElements[1]);

        Random rnd = new Random();
        int a = rnd.nextInt(100);
        int b = rnd.nextInt(100);
        int newSize = compressArray(array, a, b);
        for (int i = newSize; i < array.length; i++) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));



        int sum1 = 0;
        for (int number : array) {
            sum1 += sumOfDigits(number);
        }
        System.out.println("Сумма всех цифр в массиве: " + sum1);
    }

    /**
     * Опеределение суммы цифр заданного числа
     * @param number признак заданное число
     * @return sum1 сумма цифр заданного числа
     */
       public static int sumOfDigits(int number) {
        int sum1 = 0;

        while (number > 0) {
            sum1 += number % 10;
            number /= 10;
        }
        return sum1;
    }

    /**
     * Сжатие массива после удаления элеметов из заданного интервала
     * @param arr признак массив
     * @param a нижняя граница интервала
     * @param b верхняя граница интервала
     * @return размер нового массива
     */
    public static int compressArray(int[] arr, int a, int b) {
        int newSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a || arr[i] > b) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        return newSize;
    }

    /**
     * Определение двух наименьших элементов массива
     * @param array признак массив
     * @return два наименьших элемента массива
     */
    public static int[] findTwoSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        int[] result = {smallest, secondSmallest};
        return result;
    }

    /**
     * Нахождение среднего арифметического среди элементов массива
     * @param array признак массив
     * @return среднее арифметическое
     */
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }

    /**
     * Опеределение элементов массива меньше среднего арифметического
     * @param array признак массив
     * @param average признак среднее арифметическое
     * @return массив
     */
    public static int[] getElementsLessThanAverage(int[] array, double average) {
        int count = 0;
        for (int element : array) {
            if (element < average) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int element : array) {
            if (element < average) {
                result[index++] = element;
            }
        }
        return result;
    }

    /**
     * Определяет максимальный элемент массива с четным индексом
     * @param array признак массив
     * @return максимальный элемент с четным индексом
     */
    private static int maxElement(int[] array) {

        int maxEvenIndex = -1;
        int maxEvenValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > maxEvenValue) {
                maxEvenValue = array[i];
                maxEvenIndex = i;
            }
        }
        return maxEvenIndex;
    }

    /**
     * Определение суммы четных положительных элементов массива
     * @param array массив
     * @return сумма четных положительных элементов массива
     */
    private static int sumEvenElements(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
