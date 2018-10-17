package ru.dimasokol.lesson4.dogs;

/**
 * @author Дмитрий Соколов <Sokolov.D.Pav@sberbank.ru>
 */
public class Beagle extends Dog {
    /**
     * Конструктор для потомков, принимающий имя пса.
     *
     * @param name Имя животного, или {@code null}, если пёс дворовый
     */
    public Beagle(String name) {
        super(name);
    }

    @Override
    protected String getTalk() {
        return "Га-уууууууууууу!";
    }

    @Override
    protected String getBreed() {
        return "бигль";
    }
}
