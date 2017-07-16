package me.yanhaonan.singleton;

/**
 * Created by Vegeta on 7/16/17.
 */
public class Singleton {
    public static Singleton instance;

    private Singleton() {
        System.out.println("Singleton(): Initializing Instance");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    System.out.println("getInstance(): First time getInstance was invoked!");
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething(): Singleton does something!");
    }
}
