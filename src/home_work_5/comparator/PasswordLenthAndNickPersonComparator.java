package home_work_5.comparator;

import home_work_5.Person;

import java.util.Comparator;

public class PasswordLenthAndNickPersonComparator implements Comparator<Person> {
    //переопределяем метод compare
    @Override
    public int compare(Person person1, Person person2) {

        if (person1.getNick() == null || person2.getNick() == null) //проверка на null
            return 0;

        if (person1.getPassword().length() == person2.getPassword().length()) { // при равной длине пароля попадаем в сравнение ников
            return person1.getNick().compareTo(person2.getNick());
        }

        return person1.getPassword().length() - person2.getPassword().length(); // сравниваем целые числа, получим отрицательный или положительный результат
    }

}
