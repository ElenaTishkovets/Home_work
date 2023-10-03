package home_work_2.arrays;

/**
 * Перебор (итерирование) массива циклом "while"
 */
public class WhileOperation implements IArraysOperation {
    /**
     * Вывод всех элементов массива в консоль
     * @param array
     */
    @Override
    public void printAllElements(int[] array) {
        System.out.println("Цикл while");
        System.out.print("Вывод всех элементов массива:");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    /**
     * Вывод каждого второго элемента массива в консоль
     * @param array
     */
    @Override
    public void printEverySecondElement(int[] array) {
        System.out.print("Вывод каждого второго элемента массива:");

        int i = 1;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2;
        }
        System.out.println();
    }

    /**
     * Вывод всех элементов массива в обратном порядке
     * @param array
     */
    @Override
    public void printReverseOrder(int[] array) {
        System.out.print("Вывод всех элементов массива в обратном порядке:");
        int i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println();
    }
}
