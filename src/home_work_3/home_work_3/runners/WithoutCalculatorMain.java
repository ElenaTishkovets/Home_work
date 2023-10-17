package home_work_3.runners;
/**
 * 1. Создать класс WithoutCalculatorMain в котором необходимо посчитать следующее выражение:
 * 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */
public class WithoutCalculatorMain {
    public static void main(String[] args) {

        double result = 4.1 + 15 * 7 + Math.pow((28 / 5.0), 2); // Результат 140.45999999999998
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
