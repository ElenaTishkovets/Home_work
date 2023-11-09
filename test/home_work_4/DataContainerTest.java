package home_work_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DataContainerTest {

    @Test
    public void add() {
        DataContainer<Integer> dataIntChekAdd = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        Assertions.assertEquals(3, dataIntChekAdd.add(777));

    }

    @Test
    public void add1() {
        DataContainer<Integer> dataIntChekAdd = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        Assertions.assertEquals(-1, dataIntChekAdd.add(null));
    }

    @Test
    public void add2() {
        DataContainer<Integer> dataIntChekAdd = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        Assertions.assertEquals(1, dataIntChekAdd.add(777));
    }

    @Test
    public void add3() {
        DataContainer<Integer> dataIntChekAdd = new DataContainer<>(new Integer[]{1, 2, 3});
        Assertions.assertEquals(3, dataIntChekAdd.add(777));
    }

    @Test
    public void add4() {
        DataContainer<Integer> dataIntChekAdd = new DataContainer<>(new Integer[]{});
        Assertions.assertEquals(0, dataIntChekAdd.add(777));
    }

    @Test
    public void get() {
        DataContainer<Integer> data = new DataContainer<>(new Integer[]{});
        Assertions.assertNull(data.get(0));
        data.add(9999);
        Assertions.assertEquals(9999, data.get(0));
        Assertions.assertNull(data.get(1));
        Assertions.assertNull(data.get(-1));
    }

    @Test
    public void getItems() {
        DataContainer<Integer> data = new DataContainer<>(new Integer[]{1, 2, 3, null});
        Integer[] expected = {1, 2, 3, null};
        assertArrayEquals(expected, data.getItems());
    }

    @Test
    public void deleteIndex() {
        DataContainer<Integer> data = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        System.out.println("Первоначальный массив: " + data.toString());
        Assertions.assertFalse(data.delete(9));
        System.out.println("Массив после вызова индекса больше длинны массива: " + data.toString());
        Assertions.assertTrue(data.delete(3));
        System.out.println("Массив после удаления элемента с индексом 3: " + data.toString());
        Assertions.assertTrue(data.delete(1));
        System.out.println("Массив после удаления элемента из середины массива: " + data.toString());
        ;
    }

    @Test
    public void deleteItemInteger() {
        DataContainer<Integer> data = new DataContainer<>(new Integer[]{1, null, null, 2, 3, 5, 777, 3});
        System.out.println("Первоначальный массив: " + data.toString());
        Assertions.assertFalse(data.delete(null));
        System.out.println("Массив после вызова null: " + data.toString());
        Assertions.assertFalse(data.delete(Integer.valueOf(111)));
        System.out.println("Массив после вызова несуществующего элемента: " + data.toString());
        Assertions.assertTrue(data.delete(Integer.valueOf(777)));
        System.out.println("Массив после вызова элемента \"777\": " + data.toString());
        Assertions.assertTrue(data.delete(Integer.valueOf(3)));
        System.out.println("Массив после вызова элемента \"3\": " + data.toString());
    }

    @Test
    public void deleteItemString() {
        DataContainer<String> data = new DataContainer<>(new String[]{"Привет", "Работаю", "Как дела", "Давай потом", null});
        System.out.println("Первоначальный массив: " + data.toString());
        Assertions.assertFalse(data.delete("Пока"));
        System.out.println("Массив после вызова несуществующего элемента: " + data.toString());
        Assertions.assertFalse(data.delete(null));
        System.out.println("Массив после вызова null: " + data.toString());
        Assertions.assertTrue(data.delete("Работаю"));
        System.out.println("Массив после вызова элемента \"Работаю\": " + data.toString());
    }

    @Test
    public void sortInt() {
        DataContainer<Integer> data = new DataContainer<>(new Integer[]{3, 1, 3, 777, 5});
        Integer[] expected = {1, 3, 3, 5, 777};
        data.sort(new IntegerComparator());
        assertArrayEquals(expected, data.getItems());
        System.out.println(data.toString());
    }

    @Test
    public void sortString() {
        DataContainer<String> data = new DataContainer<>(new String[]{"i", "hello", "1", "Как домашка"});
        String[] expected1 = {"i", "1", "hello", "Как домашка"};
        data.sort(new StringLengthComparator());
        assertArrayEquals(expected1, data.getItems());
        System.out.println(data.toString());

        String[] expected2 = {"1", "hello", "i", "Как домашка"};
        data.sort(new StringAlphabeticComparator());
        assertArrayEquals(expected2, data.getItems());
        System.out.println(data.toString());
    }

    @Test
    public void checktoString() {
        DataContainer<Integer> data = new DataContainer<>(new Integer[]{1, 2, 3, null});
        String expected = "[1, 2, 3]";
        Assertions.assertEquals(expected, data.toString());
        System.out.println(data.toString());

        DataContainer<Integer> data1 = new DataContainer<>(new Integer[]{});
        String expected1 = "[]";
        Assertions.assertEquals(expected1, data1.toString());
        System.out.println(data.toString());
    }
}




