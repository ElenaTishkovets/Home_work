package home_work_2.loops;

import java.util.Scanner;

/**
 * Вывод ряда Фибоначчи до порядкового элемента, определенного пользователем
 */
public class Task1_5_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество элементов ряда Фибоначчи: ");
        int n = console.nextInt();

        int first = 1;
        int second = 2;

        System.out.print("Первые " + n + " элементов ряда Фибоначчи: ");

        for (int i = 2; i < n+2; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        console.close();
    }
}
