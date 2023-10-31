package home_work_3.runners;
/**
 * Создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражение: 4.1 + 15 * 7 + (28 / 5) ^ 2
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        double result = calculator.addComposite(4.1, (calculator.addComposite (calculator.multiplyComposite(15, 7),
                (calculator.powerComposite((calculator.divideComposite(28,5.0)),2)))));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result); //140.45999999999998
        System.out.println("Калькулятор использовался: " + calculator.getCountOperation() + " раз"); //5 раз
    }
}