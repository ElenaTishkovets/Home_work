package home_work_3.calcs.simple;
/**
 * Создать класс CalculatorWithOperator.
 * 1 Все методы, объявленные в данном классе, НЕ статические (не имеют модификатор static).
 * 2 В классе должны присутствовать математические методы:
 * 2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен принимать два параметра (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
 * 2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
 * 3 В методах можно использовать любые арифметические операторы.
 * 4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой, то для реализации метода "Квадратный корень из числа" можно воспользоваться библиотекой Math.
 */

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator{
    //public static boolean isDebugMode = false;

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
     * находит разницу между двумя числами с плавающей точкой
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
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    /**
     * Определяет модуль числа с плавающей точкой
     * @param number признак число с плавающей точкой
     * @return модуль числа с плавающей точкой
     */
    public double absolute(double number) {
        return (number < 0) ? -number : number;
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
//    public static void checkStartDebugMode(String[] arr) {
//        for (String arg : arr) {
//            if("debug".equalsIgnoreCase(arg)){
//                isDebugMode= true;
//            }
//        }
//    }
}

