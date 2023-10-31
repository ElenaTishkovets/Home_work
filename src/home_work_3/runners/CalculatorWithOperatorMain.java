package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражение 4.1 + 15 * 7 + (28 / 5) ^ 2
 */
public class CalculatorWithOperatorMain {
//    checkStartDebugMode(args);

    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

        double result = calculator.add(4.1, (calculator.add(calculator.multiply(15, 7),
        (calculator.power((calculator.divide(28, 5.0)), 2)))));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result); // Результат 140.45999999999998
    }
//    public static void checkStartDebugMode(String[] arr) {
//        for (String arg : arr) {
//            if("debug".equalsIgnoreCase(arg)){
//                isDebugMode= true;
//            }
//        }
//    }
}
