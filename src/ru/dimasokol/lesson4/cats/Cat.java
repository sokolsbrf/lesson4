package ru.dimasokol.lesson4.cats;

import ru.dimasokol.lesson4.Animal;

/**
 * Абстрактный кот
 *
 * @author Дмитрий Соколов <Sokolov.D.Pav@sberbank.ru>
 */
public abstract class Cat extends Animal {
    /**
     * Конструктор для потомков, принимающий имя кота.
     *
     * @param name Имя животного, или {@code null}, если кота никто не назвал
     */
    protected Cat(String name) {
        super(name);
    }

    @Override
    protected String getSpecies() {
        return "Кот";
    }

    @Override
    protected String getTalk() {
        return "Мяу!";
    }
}
