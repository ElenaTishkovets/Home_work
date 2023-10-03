package home_work_2.loops;

import java.util.Scanner;

/**
 * Возводение числа в степень
 * number - число, которое необходимо возвести в степень, вводится пользователем с консоли
 * exponent - степень, вводится пользователем с консоли
 */

public class Task1_3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Введите возводимое число: ");
        double number = console.nextDouble();

        System.out.print("Введите степень: ");
        int exponent = console.nextInt();

        double result = 1.0;

        if (exponent >= 0) {
            for (int i = 0; i < exponent; i++) {
                result *= number;
            }
        } else {
            exponent = -exponent;
            for (int i = 0; i < exponent; i++) {
                result *= number;
            }
            result = 1.0 / result;
        }
        System.out.println(number + " ^ " + exponent + " = " + result);
    }
}
