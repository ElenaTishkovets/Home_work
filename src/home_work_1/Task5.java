package home_work_1;
//5.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
//        5.1 Данный метод будет принима два параметра
//        5.2 Будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
//        5.3 Первый параметр boolean weekday обозначает рабочий день
//        5.4 Второй параметр boolean vacation обозначает отпуск.
//        5.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
//        5.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Сейчас рабочий день?");
        boolean answer1 = console.nextBoolean();
        System.out.println("У Вас сейчас отпуск?");
        boolean answer2 = console.nextBoolean();

        Task5 situation = new Task5();


        boolean result = situation.sleepIn(answer1, answer2);
        System.out.println(result);

        if (result) {
            System.out.println("Продолжаем спать");
        } else {
            System.out.println("Встаем срочно на работу!");
        }
    }

    /**
     * Проверяем можем спать дальше или нет
     *
     * @param weekday  признак рабочий день
     * @param vacation признак отпуск
     * @return true - если можно спать
     * false - если спать нельзя
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
