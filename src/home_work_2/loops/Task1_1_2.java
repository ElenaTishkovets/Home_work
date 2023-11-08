package home_work_2.loops;

//1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint, если хотите можете
// добавить проверки на корректность ввода данных. Число положительное, максимум long:
//        1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//        Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
//        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//        1.1.1. Используя только цикл
//        1.1.2.* Используя рекурсию

public class Task1_1_2 {

    /**
     * Метод представляет ответ в виде строки элементов от 1 до указанного числа
      * @param inputNumberRec указанное число для обработки
     * @return строку элементов вида 1 * 2 * 3 * 4 * 5 = 120
     */
    public static String factorialRecursion(int inputNumberRec) {
        if (inputNumberRec < 0) {
            return "Пожалуйста, введите положительное число";
        }
        if (inputNumberRec == 0) {
            return "0";
        }

        long result = myltiply(inputNumberRec);

        String answer = "1";
        for (int i = 2; i <= inputNumberRec; i++) {
            if (result > Integer.MAX_VALUE / i) {
                return "Произошло переполнение";
            }
            answer += " * " + i;
        }
        return answer + " = " + result;
    }

    /**
     * Метод вычисляет множество элементов от 1 до указанного числа
     * @param inputNumberRec указанное для обработки число
     * @return результат перемножения
     */
    private static long myltiply(int inputNumberRec) {
        if (inputNumberRec == 1) {
            return 1L;
        } else {
            return inputNumberRec * myltiply(inputNumberRec - 1);
        }
    }
}



