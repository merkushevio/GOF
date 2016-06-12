package singleton;

/**
 * Created by igor on 6/12/16.
 */
//Double Checked Locking & volatile
//Lazy initialization
public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked instance;

    public static SingletonDoubleChecked getInstance() {
        SingletonDoubleChecked localInstance = instance;
        if (localInstance == null) {
            synchronized (SingletonDoubleChecked.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SingletonDoubleChecked();
                }
            }
        }
        return localInstance;
    }
}
