package design.patterns.singleton;

public class Singleton {
    // eager initialization.
    private static Singleton singletonInstance = new Singleton();
    // lazy loading initialization
    private static Singleton singletonInstance1 = null;
    // double check locking system
    private static Singleton singletonInstance2 = null;
    private Singleton(){

    }

    public static Singleton getInstance(){
        return singletonInstance;
    }

    public static synchronized Singleton getSingletonInstance(){
        return singletonInstance;
    }

    public static synchronized Singleton getSingletonInstance1(){
        if(singletonInstance1 == null){
            singletonInstance1 = new Singleton();
        }

        return singletonInstance1;
    }

    public static Singleton getSingletonInstance2(){
        if(singletonInstance2 == null){
            synchronized (Singleton.class){
                if(singletonInstance2 == null){
                    singletonInstance2 = new Singleton();
                }
            }
        }

        return singletonInstance2;
    }
}