package home_work_2.loops;

import java.util.Scanner;
/**
 * Вывод ряда чисел в заданном диапазоне с заданным  шагом
 */
public class Task1_5_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите минимум: ");
        int min = console.nextInt();
        System.out.print("Введите максимум: ");
        int max = console.nextInt();
        System.out.print("Введите шаг: ");
        int step = console.nextInt();

        for (int i = min; i <= max; i += step) {
            System.out.print(i);
            if (i + step <= max) {
                System.out.print(", ");
            }
        }
    }
}
