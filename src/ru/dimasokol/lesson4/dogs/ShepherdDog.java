package ru.dimasokol.lesson4.dogs;

/**
 * Овчарка
 *
 * @author Дмитрий Соколов <Sokolov.D.Pav@sberbank.ru>
 */
public class ShepherdDog extends Dog {
    /**
     * Конструктор для потомков, принимающий имя пса.
     *
     * @param name Имя животного, или {@code null}, если пёс дворовый
     */
    public ShepherdDog(String name) {
        super(name);
    }

    @Override
    protected String getBreed() {
        return "овчарка";
    }
}
