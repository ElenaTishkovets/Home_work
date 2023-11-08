package home_work_2.loops;

import java.util.Scanner;
/**
 * Вывод цифр заданного пользователем числа в обратном порядке
 */
public class Task1_5_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = console.nextInt();

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        System.out.println("Обратное число: " + reversedNumber);
    }
}
