package home_work_2.loops;

//1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint, если хотите можете
// добавить проверки на корректность ввода данных. Число положительное, максимум long:
//        1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//        Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
//        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//        1.1.1. Используя только цикл
//        1.1.2.* Используя рекурсию

public class Task1_1_1 {

    /**
     * Метод перемножает числа от 1 до указанного числа и предоставляет ответ в виде строки элементов
     * @param inputNumber число для обработки
     * @return 1 * 2 * 3 * 4 * 5 = 120
     */
    public static String factorial(int inputNumber) {
        if (inputNumber < 0) {
            return "Пожалуйста, введите положительное число";
        }

        if (inputNumber == 0) {
            return "0";
        }

        long result = 1L;
        String answer = "1";
        for (int i = 2; i <= inputNumber; i++) {
            if (result > Integer.MAX_VALUE / i) {
                return "Произошло переполнение";
            }
            result *= i;
            answer += " * " + i;
        }
        return answer + " = " + result;
    }
}



