package ru.dimasokol.lesson4.dogs;

/**
 * Лабрадор
 *
 * @author Дмитрий Соколов <Sokolov.D.Pav@sberbank.ru>
 */
public class Labrador extends Dog {
    /**
     * Конструктор для потомков, принимающий имя пса.
     *
     * @param name Имя животного, или {@code null}, если пёс дворовый
     */
    public Labrador(String name) {
        super(name);
    }

    @Override
    protected String getBreed() {
        return "лабрадор";
    }
}
