package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Создать класс CalculatorWithCounterDelegateChoiceAgregationMain в котором будет точка входа (main метод). В main методе требуется:
 * Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithOperator и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathCopy и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathExtends и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculatorOperator = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithOperator);

        double resultOperator = calculatorWithOperator.add(4.1, (calculatorWithOperator.add((calculatorWithOperator.multiply(15, 7)),
                calculatorWithOperator.power((calculatorWithOperator.divide(28, 5.0)), 2))));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultOperator);
        System.out.println("Калькулятор использовался: " + calculatorOperator.getCountOperation() + " раз");


        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculatorMathCopy = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathCopy);

        double resultMathCopy = calculatorWithMathCopy.add(4.1, (calculatorWithMathCopy.add((calculatorWithMathCopy.multiply(15, 7)),
                calculatorWithMathCopy.power((calculatorWithMathCopy.divide(28, 5.0)), 2))));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultMathCopy);
        System.out.println("Калькулятор использовался: " + calculatorMathCopy.getCountOperation() + " раз");


        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculatorExtends = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathExtends);

        double resultExtends = calculatorWithMathExtends.add(4.1, (calculatorWithMathExtends.add((calculatorWithMathExtends.multiply(15, 7)),
                calculatorWithMathExtends.power((calculatorWithMathExtends.divide(28, 5.0)), 2))));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultExtends);
        System.out.println("Калькулятор использовался: " + calculatorExtends.getCountOperation() + " раз");

    }
}