package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется
 * создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих
 * в просчёте, вместо них необходимо использовать метод save, а также результатов работы методов калькулятора,
 * можно использовать только литералы и метод получения из памяти записанного значения
 */
public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        ICalculator iCalculator = new CalculatorWithMathCopy();
        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(iCalculator);
        calculatorWithMemory.divide(28, 5.0);
        calculatorWithMemory.save();
        calculatorWithMemory.power(calculatorWithMemory.load(), 2);
        calculatorWithMemory.save();
        calculatorWithMemory.add(calculatorWithMemory.load(), 4.1);
        calculatorWithMemory.save();
        calculatorWithMemory.add(calculatorWithMemory.load(), calculatorWithMemory.multiply(15, 7));
        calculatorWithMemory.save();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calculatorWithMemory.load());  //140.45999999999998);
    }
}
