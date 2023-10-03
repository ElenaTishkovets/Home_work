package home_work_2.loops;

import java.util.Scanner;

public class Task1_1_2 {
    /**
     * 1. Задать число
     * 2. Провести проверку введенного числа
     * 3. Создать рекурсивный метод для перемножения чисел
     * 4. Вывести в консоль в требуемой форме
     */

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = console.nextInt();

        if (number < 0) {
            System.out.println("Пожалуйста, введите положительное число.");
            return;
        }

        if (number == 0) {
            System.out.println("0");
            return;
        } else {
            long result = Myltiply(number);
            for (int i = 1; i <= number; i++) {
                System.out.print(i);
                if (i < number) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" = " + result);
        }
    }
    public static long Myltiply(int number) {
        if (number == 1) {
            return 1;
        }
        return number * Myltiply(number - 1);
    }
}
