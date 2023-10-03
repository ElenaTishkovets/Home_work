package home_work_2.arrays;

/**
 * Перебор (итерирование) массива циклом "for"
 */
public class ForOperation implements IArraysOperation {
    /**
     * Вывод всех элементов массива в консоль
     * @param array
     */
    @Override
    public  void printAllElements(int[] array) {
        System.out.println("Цикл for: ");
        System.out.print("Вывод всех элементов массива:");
        int i;
        System.out.print("for: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
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
        System.out.print("for: ");
        for (i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Вывод всех элементов массива в обратном порядке
     * @param array
     */
    @Override
    public void printReverseOrder(int[] array) {
        int i;
        System.out.print("Вывод всех элементов массива в обратном порядке:");
        System.out.print("for: ");
        for (i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
