package singleton;

/**
 * Created by igor on 6/12/16.
 */


// Synchronized Accessor
// Lazy initialization
public class Singleton {
    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
