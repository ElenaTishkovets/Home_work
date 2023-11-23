package home_work_5.comparator;

import home_work_5.Animal;

import java.util.Comparator;

public class AgeAndNickAnimalComparator implements Comparator<Animal> {
    //переопределяем метод compare
    @Override
    public int compare(Animal animal1, Animal animal2) {

        if (animal1.getAge() == 0 || animal2.getAge() == 0 || animal1.getNick() == null || animal2.getNick() == null)
            return 0; // проверка на 0 и на null

        if (animal1.getAge() == animal2.getAge()) {    // при равной длине пароля попадаем в сравнение кличек
            return animal1.getNick().compareTo(animal2.getNick());
        }
        return animal1.getAge() - animal2.getAge(); // сравниваем целые числа, получим отрицательный или положительный результат

    }

}
