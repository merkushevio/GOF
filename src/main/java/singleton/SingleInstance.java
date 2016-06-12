package singleton;

/**
 * Created by igor on 6/12/16.
 */

// Предпочтительная реализация синглтона с поддержкой сериализации
public enum SingleInstance {
    /**
     * The one and only instance of the singleton.
     * <p>
     * By definition as an enum there MUST be only one of these and it is inherently thread-safe.
     */
    INSTANCE {
        public void doSomething() {
            // What it does.
        }

    };

    public static SingleInstance getInstance() {
        return SingleInstance.INSTANCE;
    }
}
