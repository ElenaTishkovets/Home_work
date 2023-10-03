package home_work_2.loops;

import java.util.Scanner;

public class Task1_1_1 {

    /**
     * 1. Задать число
     * 2. Провести проверку введенного числа
     * 3. Создать цикл перемножения
     * 4. Проверить выражение на переполнение
     * 5. Вывести в консоль в требуемой форме
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
        }

        long result = 1L;
        String answer = "1";
        for (int i = 2; i <= number; i++) {
            if (result > Integer.MAX_VALUE / i) {
                System.out.println("Произошло переполнение.");
                return;
            }
            result *= i;
            answer += " * " + i;
        }

        System.out.println(answer + " = " + result);

    }
}


