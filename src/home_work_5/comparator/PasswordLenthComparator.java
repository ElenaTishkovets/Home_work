package home_work_5.comparator;

import home_work_5.Person;

import java.util.Comparator;

public class PasswordLenthComparator implements Comparator<Person> {
    //переопределяем метод compare
    @Override
    public int compare(Person person1, Person person2) {

        return person1.getPassword().length() - person2.getPassword().length(); // сравниваем целые числа, получим отрицательный или положительный результат
    }

}
