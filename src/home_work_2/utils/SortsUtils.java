package home_work_2.utils;

/**
 * Сортировка переданного массива при помощи алгоритма пузырьковая сортировка
 */
public class SortsUtils {
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    /**
     * Сортировка переданного массива при помощи алгоритма шейкерная сортировка
     */
    public static void shake(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        boolean swapped;
        while (left < right) {
            swapped = false;
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                }
            }
            left++;

            if (!swapped) {
                break;
            }
        }
    }
}
