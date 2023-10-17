package home_work_3.runners;
/**
 * Создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражение: 4.1 + 15 * 7 + (28 / 5) ^ 2
 * При каждой математической операции самостоятельно вызывать метод incrementCountOperation() для увеличения счётчика. Вывести в консоль результат.
 */
import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double result1 = calculator.divide(28, 5.0);
        calculator.incrementCountOperation(); // Увеличиваем счетчик после деления

        double result2 = calculator.power(result1, 2);
        calculator.incrementCountOperation(); // Увеличиваем счетчик после возведения в степень

        double result3 = calculator.multiply(15, 7);
        calculator.incrementCountOperation(); // Увеличиваем счетчик после умножения

        double result4 = calculator.add(4.1, result3);
        calculator.incrementCountOperation(); // Увеличиваем счетчик после сложения

        double result5 = calculator.add(result4, result2);
        calculator.incrementCountOperation(); // Увеличиваем счетчик после сложения

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result5); //140.45999999999998
        System.out.println("Калькулятор использовался: " + calculator.getCountOperation() + " раз"); //5 раз
    }
}