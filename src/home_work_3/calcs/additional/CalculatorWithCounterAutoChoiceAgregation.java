package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Создать класс CalculatorWithCounterAutoChoiceAgregation.
 * 1 Все методы, объявленные в данных классах, НЕ статические (не имеют модификатор static).
 * 2 В данном классе должны быть следующие варианты конструктора:
 * 2.1 Принимающий объект типа CalculatorWithOperator
 * 2.2 Принимающий объект типа CalculatorWithMathCopy
 * 2.3 Принимающий объект типа CalculatorWithMathExtends
 * 4 Данные класс также не умеет напрямую считать математику, они умеют делегировать расчёт математики калькулятору который передали в конструктор.
 * 5 В классах должны присутствовать математические методы:
 * 5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 */
public class CalculatorWithCounterAutoChoiceAgregation {
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

    private CalculatorWithOperator calculatorWithOperator;//поле, хранящее объект класса CalculatorWithOperator
    private CalculatorWithMathCopy calculatorWithMathCopy;//поле, хранящее объект класса CalculatorWithMathCopy
    private CalculatorWithMathExtends calculatorWithMathExtends;//поле, хранящее объект класса CalculatorWithMathExtends

    /**
     * Конструктор для инициализации поля путем передачи объекта на вход конструктора
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    /**
     * Конструктор для инициализации поля путем передачи объекта на вход конструктора
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }
    /**
     * Конструктор для инициализации поля путем передачи объекта на вход конструктора
     */
        public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
            this.calculatorWithMathExtends = calculatorWithMathExtends;
        }

    /**
     * складывает два числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат сложения двух чисел а и b
     */
        public double add ( double a, double b){
            countOperation++;
            if (calculatorWithOperator != null) return calculatorWithOperator.add(a, b);
            if (calculatorWithMathCopy != null) return calculatorWithMathCopy.add(a, b);
            if (calculatorWithMathExtends != null) return calculatorWithMathExtends.add(a, b);
            return 0;
        }

    /**
     * находит разницу между двумя числами с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат вычитания чисел b из числа a
     */
        public double subtract ( double a, double b){
            countOperation++;
            if (calculatorWithOperator != null) return calculatorWithOperator.subtract(a, b);
            if (calculatorWithMathCopy != null) return calculatorWithMathCopy.subtract(a, b);
            if (calculatorWithMathExtends != null) return calculatorWithMathExtends.subtract(a, b);
            return 0;
        }

    /**
     * умножает два числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат умножения двух чисел а и b
     */
        public double multiply ( double a, double b){
            countOperation++;
            if (calculatorWithOperator != null) return calculatorWithOperator.multiply(a, b);
            if (calculatorWithMathCopy != null) return calculatorWithMathCopy.multiply(a, b);
            if (calculatorWithMathExtends != null) return calculatorWithMathExtends.multiply(a, b);
            return 0;
        }

    /**
     * делит одно число с плавающей точкой на другое, увеличивает счетчик использования калькулятора
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат деления числа а на число b
     */
        public double divide ( double a, double b){

            countOperation++;
            if (calculatorWithOperator != null) return calculatorWithOperator.divide(a, b);
            if (calculatorWithMathCopy != null) return calculatorWithMathCopy.divide(a, b);
            if (calculatorWithMathExtends != null) return calculatorWithMathExtends.divide(a, b);
            return 0;
        }

    /**
     * Метод возведения в степень числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param base     признак число с плавающей точкой
     * @param exponent признак степень
     * @return результат возведения числа с плавающей точкой встепень
     */
        public double power ( double base, int exponent){
            countOperation++;
            if (calculatorWithOperator != null) return calculatorWithOperator.power(base, exponent);
            if (calculatorWithMathCopy != null) return calculatorWithMathCopy.power(base, exponent);
            if (calculatorWithMathExtends != null) return calculatorWithMathExtends.power(base, exponent);
            return 0;
        }

    /**
     * Определяет модуль числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param number признак число с плавающей точкой
     * @return модуль числа с плавающей точкой
     */
        public double absolute ( double number){

            countOperation++;
            if (calculatorWithOperator != null) return calculatorWithOperator.absolute(number);
            if (calculatorWithMathCopy != null) return calculatorWithMathCopy.absolute(number);
            if (calculatorWithMathExtends != null) return calculatorWithMathExtends.absolute(number);
            return 0;
        }

    /**
     * извлекает квадратный корень из числа с плавающей точкой, увеличивает счетчик использования калькулятора
     * @param number признак число с плавающей точкой
     * @return квадратный корень из числа с плавающей точкой
     */
        public double squareRoot ( double number){

            countOperation++;
            if (calculatorWithOperator != null) return calculatorWithOperator.squareRoot(number);
            if (calculatorWithMathCopy != null) return calculatorWithMathCopy.squareRoot(number);
            if (calculatorWithMathExtends != null) return calculatorWithMathExtends.squareRoot(number);
            return 0;
        }
}
