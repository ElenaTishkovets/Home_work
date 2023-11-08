package home_work_2.loops;

import java.util.Scanner;
/**
 * Определение наибольшей цифры в заданном пользователем числе
 */
public class Task1_5_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        long number = console.nextLong();

        int maxDigit = 0;

        while (number > 0) {
            int digit = (int) (number % 10);
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        System.out.println("Наибольшая цифра в числе: " + maxDigit);
    }
}
