package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * Создать класс CalculatorWithMathCopy.
 * 1 Все методы, объявленные в данном классе, НЕ статические (не имеют модификатор static).
 * 2 В классе должны присутствовать математические методы:
 * 2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые математические операции из CalculatorWithOperator.
 * 2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа). Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 */
public class CalculatorWithMathCopy implements ICalculator {

    /**
     * складывает два числа с плавающей точкой
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат сложения двух чисел а и b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * нахоидит разницу между двумя числами с плавающей точкой
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат вычитания чисел b из числа a
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * умножает два числа с плавающей точкой
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат умножения двух чисел а и b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * делит одно число с плавающей точкой на другое
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат деления числа а на число b
     */
    public double divide(double a, double b) {
        if (b == 0) {
//            if (isDebugMode) {
//                System.out.println("Exception in thread java.lang.NullPointerException");
//            }
            System.out.println("Ошибка: деление на ноль!");
            return Double.NaN; // возвращаем NaN (Not-a-Number) в случае деления на ноль
        }
        return a / b;
    }

    /**
     * Метод возведения в степень числа с плавающей точкоей
     * @param base     признак число с плавающей точкой
     * @param exponent признак степень
     * @return результат возведения числа с плавающей точкой встепень
     */
    public double power(double base, int exponent) {
        if (exponent < 0) {
            System.out.println("Ошибка: отрицательная степень!");
            return Double.NaN;
        }
        return Math.pow(base, exponent);
    }

    /**
     * Определяет модуль числа с плавающей точкой
     * @param number признак число с плавающей точкой
     * @return модуль числа с плавающей точкой
     */
    public double absolute(double number) {
        return Math.abs(number);
    }

    /**
     * извлекает квадратный корень из числа с плавающей точкой
     * @param number признак число с плавающей точкой
     * @return квадратный корень из числа с плавающей точкой
     */
    public double squareRoot(double number) {
        if (number < 0) {
            System.out.println("Ошибка: извлечение корня из отрицательного числа!");
            return Double.NaN;
        }
        return Math.sqrt(number);
    }
}

