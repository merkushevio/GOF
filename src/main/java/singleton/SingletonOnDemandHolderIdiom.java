package singleton;

/**
 * Created by igor on 6/12/16.
 */
//On Demand Holder idiom
//Lazy initialization
public class SingletonOnDemandHolderIdiom {

    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
