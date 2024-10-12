public class LazyInitializedSingleton implements Runnable {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    @Override
    public void run() {
        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + singleton.hashCode());
    }
}
