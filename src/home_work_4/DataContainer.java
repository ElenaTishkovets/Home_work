package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

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
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }
        T[] tmp = Arrays.copyOf(this.data, this.data.length + 1);
        tmp[this.data.length] = item;
        this.data = tmp;
        return this.data.length - 1;
    }

    /**
     * Получает объект из массива из указанной позиции
     *
     * @param index индекс позиции массива, из которой данный метод получает объект
     * @return объект массива, полученный из уазанной позиции
     */
    public T get(int index) {
        if (index < 0 || index >= this.data.length) {
            return null;
        }
        return this.data[index];
    }

    /**
     * Возвращает элементы массива из поля data
     *
     * @return массив
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * Удаляет элемент из поля data по индексу
     *
     * @param index индекс элемента, который необходимо удалить
     * @return true - если удалось удалить элемент
     * @return false - если элемент с указанным индексом отстутствует
     */
    public boolean delete(int index) {

        if (index<0 || index >= this.data.length) {
            return false;
        }
        for (int i = index + 1; i < this.data.length; i++)
            this.data[i - 1] = this.data[i];

        this.data[this.data.length - 1] = null;

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
        for (int i = 0; i < this.data.length; i++) {
            if (Objects.equals(this.data[i], item)) {
                return delete(i);
            }
        }
        return false;
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
                if (resultCompare >0) {

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
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");

        for (int i = 0; i < this.data.length ; i++) {
            if(this.data [i]!=null){
            result.append(this.data[i]).append(", ");
            }
            if(i==data.length-1){
                result.deleteCharAt(result.length()-1).deleteCharAt(result.length()-1);
            }
        }
     result.append("]");
        return String.valueOf(result);
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













