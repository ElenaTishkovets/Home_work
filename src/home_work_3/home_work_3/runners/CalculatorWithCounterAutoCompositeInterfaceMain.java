package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        ICalculator iCalculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calculator =
                new CalculatorWithCounterAutoAgregationInterface(iCalculator);

        double result =    calculator.add(4.1, (calculator.add (calculator.multiply(15, 7),
                (calculator.power((calculator.divide(28,5.0)),2)))));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result); //140.45999999999998
        System.out.println("Калькулятор использовался: " + calculator.getCountOperation() + " раз"); //5 раз
    }
}
