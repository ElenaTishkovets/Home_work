package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * Создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражение: 4.1 + 15 * 7 + (28 / 5) ^ 2
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorMat = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation (calculatorMat);

        double result = calculator.addAgregation(4.1, (calculator.addAgregation(calculator.multiplyAgregation(15,7),
                (calculator.powerAgregation((calculator.divideAgregation(28, 5.0)), 2)))));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result); //140.45999999999998
        System.out.println("Калькулятор использовался: " + calculator.getCountOperation() + " раз"); //5 раз
    }
}
