package utility;

/**
 * Created by igor on 6/12/16.
 */


/*
 * Класс утилит не имеющий экземпляров
 */
public class UtilityClass {

    private UtilityClass() {
        // Не обязательно кидать исключение
        throw new AssertionError();
    }
}
