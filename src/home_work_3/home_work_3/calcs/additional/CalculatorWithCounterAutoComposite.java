package home_work_3.calcs.additional;


import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * Создать класс CalculatorWithCounterAutoComposite.
 * 1 Все методы и поля, объявленные в данном классе, НЕ статические (не имеют модификатор static).
 * 2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор. Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
 * 3 Инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
 * 4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору который сохранён в его поле.
 * 5 В классах должны присутствовать математические методы:
 * 5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 */
public class CalculatorWithCounterAutoComposite {
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


    private CalculatorWithMathCopy calculatorMath; //поле, хранящее объект класса калькулятор

    /**
     * Инициализция поля calculatorMath созданным внутри данного класса объектом калькулятора.
     */
    public CalculatorWithCounterAutoComposite() {
        this.calculatorMath = new CalculatorWithMathCopy();
    }

    /**
     * складывает два числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат сложения двух чисел а и b
     */
    public double addComposite(double a, double b) {
        countOperation++;
        return calculatorMath.add(a, b);
    }

    /**
     * находит разницу между двумя числами с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат вычитания чисел b из числа a
     */
    public double subtractComposite(double a, double b) {
        countOperation++;
        return calculatorMath.subtract(a, b);
    }

    /**
     * умножает два числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат умножения двух чисел а и b
     */
    public double multiplyComposite(double a, double b) {
        countOperation++;
        return calculatorMath.multiply(a, b);
    }

    /**
     * делит одно число с плавающей точкой на другое, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат деления числа а на число b
     */
    public double divideComposite(double a, double b) {
        countOperation++;
        return calculatorMath.divide(a, b);
    }

    /**
     * Метод возведения в степень числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param base     признак число с плавающей точкой
     * @param exponent признак степень
     * @return результат возведения числа с плавающей точкой встепень
     */
    public double powerComposite(double base, int exponent) {
        countOperation++;
        return calculatorMath.power(base, exponent);
    }

    /**
     * Определяет модуль числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param number признак число с плавающей точкой
     * @return модуль числа с плавающей точкой
     */
    public double absoluteComposite(double number) {
        countOperation++;
        return calculatorMath.absolute(number);
    }

    /**
     * извлекает квадратный корень из числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param number признак число с плавающей точкой
     * @return квадратный корень из числа с плавающей точкой
     */
    public double squareRootComposite(double number) {
        countOperation++;
        return calculatorMath.squareRoot(number);
    }
}