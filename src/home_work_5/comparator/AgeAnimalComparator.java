package home_work_5.comparator;

import home_work_5.Animal;
import home_work_5.Person;

import java.util.Comparator;

public class AgeAnimalComparator implements Comparator<Animal> {
    //переопределяем метод compare
    @Override
    public int compare(Animal animal1, Animal animal2) {
        if (animal1.getAge() == 0 || animal2.getAge() == 0) // проверка на 0
            return 0;

        return animal1.getAge() - animal2.getAge(); // сравниваем целые числа, получим отрицательный или положительный результат
    }

}
