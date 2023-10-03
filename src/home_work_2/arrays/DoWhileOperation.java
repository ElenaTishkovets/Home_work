package home_work_2.arrays;

/**
 * Перебор (итерирование) массива циклом "do...while"
 */
public class DoWhileOperation implements IArraysOperation {

    /**
     * Вывод всех элементов массива в консоль
     * @param array
     */
    @Override
    public void printAllElements(int[] array) {
        System.out.println("Цикл do...while: ");
        System.out.print("Вывод всех элементов массива:");
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
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
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);
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
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();
    }
}
