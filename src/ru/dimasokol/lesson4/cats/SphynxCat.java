package ru.dimasokol.lesson4.cats;

/**
 * Сфинкс
 *
 * @author Дмитрий Соколов <Sokolov.D.Pav@sberbank.ru>
 */
public class SphynxCat extends Cat {
    /**
     * Конструктор для потомков, принимающий имя кота.
     *
     * @param name Имя животного, или {@code null}, если кота никто не назвал
     */
    public SphynxCat(String name) {
        super(name);
    }

    @Override
    protected String getBreed() {
        return "сфинкс";
    }
}
