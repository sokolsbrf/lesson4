package ru.dimasokol.lesson4.dogs;

/**
 * Дворняжка
 *
 * @author Дмитрий Соколов <Sokolov.D.Pav@sberbank.ru>
 */
public class MongrelDog extends Dog {
    /**
     * Конструктор для потомков, принимающий имя пса.
     *
     * @param name Имя животного, или {@code null}, если пёс дворовый
     */
    public MongrelDog(String name) {
        super(name);
    }

    @Override
    protected String getBreed() {
        return null;
    }
}
