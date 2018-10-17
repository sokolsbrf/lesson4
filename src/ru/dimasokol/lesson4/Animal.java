package ru.dimasokol.lesson4;

/**
 * Базовый класс для животного.
 *
 * @author Дмитрий Соколов <Sokolov.D.Pav@sberbank.ru>
 */
public abstract class Animal {

    private final String name;
    private boolean sleeping = false;
    private boolean dead = false;

    /**
     * Конструктор для потомков, принимающий имя животного.
     *
     * @param name Имя животного, или {@code null}, если животное без имени
     */
    protected Animal(String name) {
        this.name = name;
    }

    /**
     * Возвращает имя животного, потомки имеют возможность использовать свою реализацию
     *
     * @return Имя животного, по умолчанию — заданное в конструкторе
     */
    public String getName() {
        return name;
    }

    /**
     * Усыпляет животное
     */
    public final void sleep() {
        sleeping = true;
    }

    /**
     * Пробуждает животное
     */
    public final void awake() {
        sleeping = false;
    }

    /**
     * Убивает животное, дальнейшее существование считается мёртвой тушкой
     */
    public final void die() {
        dead = true;
    }

    /**
     * Издать звук. Животное издаёт звуки если не спит и не умерло.
     */
    public final void talk() {
        if (!sleeping && !dead) {
            System.out.println(getTalk());
        }
    }

    @Override
    public final String toString() {
        // Мы зафиналиваем toString(), чтобы нельзя было сломать вывод в потомках

        String name = getName();
        name = (name == null)? "без имени" : name;

        String breed = getBreed();
        breed = (breed == null)? "без породы" : breed;

        // StringBuilder неявно создаётся при конкатенации строк через +
        // Мы же создадим его явно, и столь же явно используем. Для производительности.
        StringBuilder builder = new StringBuilder();
        builder
                .append(getSpecies())
                .append(", ")
                .append(breed)
                .append(", ")
                .append(name);

        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Animal animal = (Animal) o;

        if (dead != animal.dead) return false;
        // Пропускаем sleeping, считаем спящее животное тем же самым

        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (dead ? 1 : 0);
        // В хэшкоде тоже пропускаем спячку
        return result;
    }

    protected abstract String getTalk();

    /**
     * Возвращает породу животного
     *
     * @return Название породы
     */
    protected abstract String getBreed();

    /**
     * Возвращает биологический вид животного
     *
     * @return Имя биологического вида
     */
    protected abstract String getSpecies();
}
