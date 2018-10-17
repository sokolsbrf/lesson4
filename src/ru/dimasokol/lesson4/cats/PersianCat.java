package ru.dimasokol.lesson4.cats;

/**
 * Персидская кошка
 *
 * @author Дмитрий Соколов <Sokolov.D.Pav@sberbank.ru>
 */
public class PersianCat extends Cat {
    /**
     * Конструктор для потомков, принимающий имя кота.
     *
     * @param name Имя животного, или {@code null}, если кота никто не назвал
     */
    public PersianCat(String name) {
        super(name);
    }

    @Override
    protected String getBreed() {
        return "персидский";
    }
}
