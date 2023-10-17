package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * Создать класс CalculatorWithCounterAutoAgregationInterface.
 * Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам пользователь вашего класса.
 * Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору который передали в конструктор
 * В классе должны присутствовать все методы объявленные в интерфейсе.
 * В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 */
public class CalculatorWithCounterAutoAgregationInterface {

    /**
     * Поле счетчик использования калькулятора
     */
    private long countOperation;

    /**
     * Метод для получения результата работы счетчика
     * @return значение счетчика использования калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }

    private ICalculator iCalculator; // поле, хранящее объект класса интерфейс

    /**
     * Конструктор для инициализации поля путем передачи объекта на вход конструктора
     */
    public CalculatorWithCounterAutoAgregationInterface (ICalculator iCalculator){
        this.iCalculator = iCalculator;
    }

    /**
     * складывает два числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат сложения двух чисел а и b
     */
    public double add (double a, double b) {
        countOperation++;
        return iCalculator.add(a, b);
    }

    /**
     * находит разницу между двумя числами с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат вычитания чисел b из числа a
     */
    public double subtract(double a, double b) {
        countOperation++;
        return iCalculator.subtract(a, b);
    }

    /**
     * умножает два числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат умножения двух чисел а и b
     */
    public double multiply(double a, double b) {
        countOperation++;
        return iCalculator.multiply(a, b);
    }

    /**
     * делит одно число с плавающей точкой на другое, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат деления числа а на число b
     */
    public double divide(double a, double b) {
        countOperation++;
        return iCalculator.divide(a, b);
    }

    /**
     * Метод возведения в степень числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param base     признак число с плавающей точкой
     * @param exponent признак степень
     * @return результат возведения числа с плавающей точкой встепень
     */
    public double power(double base, int exponent) {
        countOperation++;
        return iCalculator.power(base, exponent);
    }

    /**
     * Определяет модуль числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param number признак число с плавающей точкой
     * @return модуль числа с плавающей точкой
     */
    public double absolute(double number) {
        countOperation++;
        return iCalculator.absolute(number);
    }

    /**
     * извлекает квадратный корень из числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param number признак число с плавающей точкой
     * @return квадратный корень из числа с плавающей точкой
     */
    public double squareRoot(double number) {
        countOperation++;
        return iCalculator.squareRoot(number);
    }
}
