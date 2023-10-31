package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data; //Поле, массив, хранящий объекты неопределенного пока типа

    // конструктор для создания объекта класса DataContainer
    public DataContainer(T[] t) {
        this.data = t;
    }

    /**
     * Метод добавляет данные во внутреннее поле массива и возвращает номер позиции в которую были вставлены
     * данные, в случае переполнения массива, увеличивает его.
     *
     * @param item объект, который необходимо добавить в массив
     * @return индекс позиции, в которую вставлен добавляемый объект
     */
    public int add(T item) {

        if (item == null) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        T[] tmp = Arrays.copyOf(data, data.length + 1);
        tmp[data.length] = item;
        data = tmp;
        return data.length - 1;
    }

    /**
     * Получает объект из массива из указанной позиции
     *
     * @param index индекс позиции массива, из которой данный метод получает объект
     * @return объект массива, полученный из уазанной позиции
     */
    public T get(int index) {
        if (index < 0 || index >= data.length) {
            return null;
        }
        return data[index];
    }

    /**
     * Возвращает элементы массива из поля data
     *
     * @return массив
     */
    public T[] getItems() {
        for (T item : data) {
            System.out.print(item + " ");
        }
        System.out.println();
        return data;
    }

    /**
     * Удаляет элемент из поля data по индексу
     *
     * @param index индекс элемента, который необходимо удалить
     * @return true - если удалось удалить элемент
     * @return false - если элемент с указанным индексом отстутствует
     */
    public boolean delete(int index) {

        if (index >= data.length) {
            return false;
        }
        T[] tmp = Arrays.copyOf(data, data.length - 1);
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (i != index) {
                tmp[j] = data[i];
                j++;
            }
        }
        data = tmp;
        return true;
    }

    /**
     * Удаляет указанный элемент из поля data;
     *
     * @param item - элемент, подлежащий удалени;
     * @return false - если указанный элемент отстутствует
     * @return true - если удалось найти и удалить элемент
     */
    public boolean delete(T item) {
        if (item == null) {             //проверяем на ввод null
            return false;
        }

        T[] tmp = Arrays.copyOf(data, data.length); // создаем временный массив
        int j = 0;
        boolean found = false; // Флаг для отслеживания наличия хотя бы одного совпадения

        for (int i = 0; i < data.length; i++)
            if (data[i] != null && data[i].equals(item)) {
                data[i] = null;
                found = true;
            }
        if (!found) {
            return false; // Возвращаем false, если не было ни одного совпадения
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {                      // проверяем каждый элемент на null
                tmp[j] = data[i];
                j++;
            }
        }
        data = Arrays.copyOf(tmp, j);
        return true;
    }

    /**
     * Метод занимается сортировкой данных записанных в поле data, используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator
     */
    public void sort(Comparator<T> comparator) {

        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < data.length - 1; i++) {
                int resultCompare = comparator.compare(data[i], data[i + 1]);
                if (resultCompare > 0) {

                    T tmp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tmp;
                    swapped = true;
                }
            }
        } while (swapped); // Продолжаем сортировку, пока есть обмены
    }

    /**
     * Переопределяет метод toString() и выводит содержимое data без ячеек в которых хранится null
     *
     * @return
     */
    public String toString() {
        T[] tmp = Arrays.copyOf(data, data.length); // создаем временный массив
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {                      // проверяем каждый элемент на null
                tmp[j] = data[i];
                j++;
            }
        }
        data = Arrays.copyOf(tmp, j);
        StringBuilder result = new StringBuilder();

        for (T item : data) {
            result.append(item).append(", ");
        }
        result.deleteCharAt(result.length() - 1).deleteCharAt(result.length() - 1);
        return "[" + result + "]";
    }

    /**
     * Сортирует элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения вызываемый у хранимых объектов
     */
    public static <T extends Comparable<? super T>> void sort(DataContainer<T> container) {
        if (container.data.length == 0) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < container.data.length - 1; i++) {
                int resultCompare = container.data[i].compareTo(container.data[i + 1]);
                if (resultCompare > 0) {

                    T tmp = container.data[i];
                    container.data[i] = container.data[i + 1];
                    container.data[i + 1] = tmp;
                    swapped = true;
                }
            }
        } while (swapped); // Продолжаем сортировку, пока есть обмены
    }
}













