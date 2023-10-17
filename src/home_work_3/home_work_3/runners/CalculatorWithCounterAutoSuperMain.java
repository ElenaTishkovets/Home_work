package home_work_3.runners;
/**
 * Создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражение: 4.1 + 15 * 7 + (28 / 5) ^ 2
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        double result = calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
                (calculator.power((calculator.divide(28, 5.0)), 2)))));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);//140.45999999999998
        System.out.println("Калькулятор использовался: " + calculator.getCountOperation() + " раз");
    }
}