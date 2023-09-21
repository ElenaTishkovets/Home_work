package home_work_1;

import java.util.Scanner;

public class Home_work_1_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите натуральное число 1: "); // выводит на печать запрос о вводе данных
        int a = in.nextInt();   //считывает целое число с клавиатуры
        System.out.print("Введите натуральное число 2: ");   // выводит на печать запрос о вводе данных
        int b = in.nextInt();   //считывает целое число с клавиатуры

        // Пример числа  157 в десятичной и двоичной системах счисления
        //157 = 1001_1101

        String binaryA = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        // Преобразование введенного числа в двоичный код 8 бит
        String binaryB = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        // Преобразование введенного числа в двоичный код 8 бит


        System.out.println("Первое число в двоичном коде: " + binaryA); // Вывод на печать первого числа в двоичном коде
        System.out.println("Второе число в двоичном коде: " + binaryB); // Вывод на печать второго числа в двоичном коде

        int resultAnd = a & b;          //Побитовая операция И
        System.out.println("Результат операции И: " + resultAnd);  //Вывод на печать результата побитовой операции И

        int resultOr = a | b;           //Побитовая операция ИЛИ
        System.out.println("Результат операции ИЛИ: " + resultOr);   //Вывод на печать результата побитовой операции ИЛИ
    }
}
class Home_work_1_1_3{
    public static void main(String[] args) {
        double a = 42.5;
        //Побитовые опрерации могут быть произведены над целыми числами
        //заданное число, является числом с плавающей точкой
        //необходимо провести преобразование в целое число
        //неявное преобразование c типом double невозможно
        //необходимо явное преобразование

        int b = (int) a;
        System.out.println(b);

        int resultAnd = b & 18;
        System.out.println(resultAnd);
        int resultOr = b | 18;
        System.out.println(resultOr);
    }
}

