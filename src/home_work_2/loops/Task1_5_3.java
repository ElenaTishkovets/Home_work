package home_work_2.loops;

import java.util.Scanner;
/**
 * Определение количества четных и нечетных цифр в ввведеном пользователем числе
 */
public class Task1_5_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        long number = console.nextLong();
        console.close();

        int evenCount = 0;
        int oddCount = 0;

        while (number > 0) {
            long digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10;
        }

        System.out.println("Четных цифр: " + evenCount);
        System.out.println("Нечетных цифр: " + oddCount);
    }
}
