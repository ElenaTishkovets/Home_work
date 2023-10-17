package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * Создать класс CalculatorWithMathExtends.
 * 1 Все методы, объявленные в данном классе, НЕ статические (не имеют модификатор static).
 * 2 Данный класс должен наследовать класс CalculatorWithOperator.
 * 3 Условия:
 * 3.1 4 базовых математических метода (деление, умножение, вычитание, сложение) НЕ ДОЛЖНЫ быть объявлены напрямую в классе, а должны быть унаследованы от родительского класса (4.2).
 * 3.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа). Данные методы должны ПЕРЕОПРЕДЕЛЯТЬ методы родительского класса (4.2) и должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 */
public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    /**
     * Метод возведения в степень числа с плавающей точкоей
     * @param base     признак число с плавающей точкой
     * @param exponent признак степень
     * @return результат возведения числа с плавающей точкой встепень
     */
    public double power(double base, int exponent) { //переопределяет метод родительского класса
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
    public double absolute(double number) {     //переопределяет метод родительского класса
        return Math.abs(number);
    }

    /**
     * извлекает квадратный корень из числа с плавающей точкой
     * @param number признак число с плавающей точкой
     * @return квадратный корень из числа с плавающей точкой
     */
    public double squareRoot(double number) {   //переопределяет метод родительского класса
        if (number < 0) {
            System.out.println("Ошибка: извлечение корня из отрицательного числа!");
            return Double.NaN;
        }
        return Math.sqrt(number);
    }


}


