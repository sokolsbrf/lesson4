package ru.dimasokol.lesson4.dogs;

import ru.dimasokol.lesson4.Animal;

/**
 * Абстрактная собака
 *
 * @author Дмитрий Соколов <Sokolov.D.Pav@sberbank.ru>
 */
public abstract class Dog extends Animal {
    /**
     * Конструктор для потомков, принимающий имя пса.
     *
     * @param name Имя животного, или {@code null}, если пёс дворовый
     */
    protected Dog(String name) {
        super(name);
    }

    @Override
    protected String getSpecies() {
        return "Собака";
    }

    @Override
    protected String getTalk() {
        return "Гав!";
    }
}
