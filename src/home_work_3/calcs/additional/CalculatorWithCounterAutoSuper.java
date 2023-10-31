package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Создать класс CalculatorWithCounterAutoSuper.
 * 1 Все методы и поля, объявленные в данном классе, НЕ статические (не имеют модификатор static).
 * 2 Данный класс наследует класс CalculatorWithMathExtends.
 * 3 Данный класс переопределяет все методы полученные в результате наследования и
 * в этих методах должен быть реализован механизм учёта их использования (учёт общий для всех методов класса),
 * а вместо реализации математики при помощи ключевого слова super вызывает данный метод у родителя.
 * Например вызвали метод plus(7, 3) который должен сложить два числа и вернуть результат сложения.
 * Внутри метода plus() пишем реализацию учета, а после делаем вызов super.plus(7, 3).
 * Использование super позволит вызвать реализацию из родительского класса.
 * 4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 */
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    /**
     * Поле счетчик использования калькулятора
     */
    private long countOperation;

    /**
     * Конструктор, устанавливающий первоначальное значение счетчика
     */
    public CalculatorWithCounterAutoSuper() {
        this.countOperation = 0;
    }

    /**
     * Метод увеличения счетчика
     */
    public void incrementCountOperation() {
        countOperation++;
    }

    /**
     * Метод для получения результата работы счетчика
     * @return значение счетчика использования калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * складывает два числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат сложения двух чисел а и b
     */
    @Override
    public double add(double a, double b) {
        incrementCountOperation();
        return super.add(a, b);
    }

    /**
     * находит разницу между двумя числами с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат вычитания чисел b из числа a
     */
    @Override
    public double subtract(double a, double b) {
        incrementCountOperation();
        return super.subtract(a, b);
    }

    /**
     * умножает два числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат умножения двух чисел а и b
     */
    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return super.multiply(a, b);
    }

    /**
     * делит одно число с плавающей точкой на другое, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат деления числа а на число b
     */
    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return super.divide(a, b);
    }

    /**
     * Метод возведения в степень числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param base     признак число с плавающей точкой
     * @param exponent признак степень
     * @return результат возведения числа с плавающей точкой встепень
     */
    @Override
    public double power(double base, int exponent) {
        incrementCountOperation();
        return super.power(base, exponent);
    }

    /**
     * Определяет модуль числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param number признак число с плавающей точкой
     * @return модуль числа с плавающей точкой
     */
    @Override
    public double absolute(double number) {
        incrementCountOperation();
        return super.absolute(number);
    }

    /**
     * извлекает квадратный корень из числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param number признак число с плавающей точкой
     * @return квадратный корень из числа с плавающей точкой
     */
    @Override
    public double squareRoot(double number) {
        incrementCountOperation();
        return super.squareRoot(number);
    }
}