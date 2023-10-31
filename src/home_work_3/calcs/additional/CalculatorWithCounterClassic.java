package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Создать класс CalculatorWithCounterClassic.
 * 1 Все методы, объявленные в данном классе, НЕ статические (не имеют модификатор static).
 * 2 Данный класс должен наследовать класс CalculatorWithMathExtends.
 * 3 В классе должен быть метод void incrementCountOperation() который должен увеличивать внутренний счётчик (поле) в калькуляторе.
 * 4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора (поле).
 */
public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    /**
     * Поле счетчик использования калькулятора
     */
    private long countOperation;

    /**
     * Конструктор, устанавливающий первоначальное значение счетчика
     */
    public CalculatorWithCounterClassic() {
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
}

