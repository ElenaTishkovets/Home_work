package home_work_2.arrays;

/**
 * Перебор (итерирование) массива циклом "foreach"
 */
public class ForEachOperation implements IArraysOperation {
    /**
     * Вывод всех элементов массива в консоль
     * @param array
     */
    @Override
    public void printAllElements(int[] array) {
        System.out.println("Цикл foreach: ");
        System.out.print("Вывод всех элементов массива:");
        for (int element : array) {
            System.out.print(element + " ");
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
        boolean print = false;
        for (int element : array) {
            if (print) {
                System.out.print(element + " ");
            }
            print = !print;
        }
        System.out.println();
    }

    /**
     * Вывод всех элементов массива в обратном порядке
     * @param array
     */
    @Override
    public  void printReverseOrder(int[] array) {
        System.out.print("Вывод всех элементов массива в обратном порядке:");
        int i;
        for (i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
