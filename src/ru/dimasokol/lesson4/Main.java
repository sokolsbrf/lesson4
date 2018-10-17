package ru.dimasokol.lesson4;

import ru.dimasokol.lesson4.cats.Cat;
import ru.dimasokol.lesson4.cats.PersianCat;
import ru.dimasokol.lesson4.cats.SphynxCat;
import ru.dimasokol.lesson4.dogs.Beagle;
import ru.dimasokol.lesson4.dogs.Dog;
import ru.dimasokol.lesson4.dogs.Labrador;
import ru.dimasokol.lesson4.dogs.MongrelDog;
import ru.dimasokol.lesson4.dogs.ShepherdDog;

public class Main {

    public static void main(String[] args) {

        Animal animals[]  = new Animal[] {
            new PersianCat("Иннокентий"),
            new SphynxCat("Полуэкт"),

            new ShepherdDog("Рекс"),
            new Labrador("Зевс"),
            new Beagle("Кольт"),
            new MongrelDog("Шарик"),
            new MongrelDog("Бобик"),
            new MongrelDog(null)
        };

        for (Animal animal: animals) {
            System.out.println(animal);
            animal.talk();
            System.out.println();
        }


        System.out.println("Приключения кота");
        Cat deadCat = new SphynxCat("Лысый");
        deadCat.talk();

        System.out.println("Поспал");
        deadCat.sleep();
        deadCat.talk();

        System.out.println("Проснулся");
        deadCat.awake();
        deadCat.talk();

        System.out.println("Умер");
        deadCat.die();
        deadCat.talk();

        System.out.println("Будить бесполезно");
        deadCat.awake();
        deadCat.talk();

        Dog dog1 = new ShepherdDog("Верный");
        Dog dog2 = new ShepherdDog("Верный");

        compareDogs(dog1, dog2);

        Dog dog3 = new MongrelDog("Барбос");

        compareDogs(dog1, dog3);

        // Одна овчарка скончалась
        dog2.die();
        compareDogs(dog1, dog2);
    }

    private static void compareDogs(Dog dog1, Dog dog2) {
        System.out.println();
        System.out.print(dog1);
        System.out.print(" и ");
        System.out.println(dog2);
        System.out.println("Одна и та же собака? " + (dog1.equals(dog2)? "Да" : "Нет"));

        dog1.sleep();
        System.out.println("А если спит? " + (dog1.equals(dog2)? "Да, всё равно одна собака" : "Нет, разные"));
        System.out.println("Хэшкоды: " + dog1.hashCode() + " и " + dog2.hashCode());
    }
}
