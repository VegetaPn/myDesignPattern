package me.yanhaonan.singleton;

/**
 * Created by Vegeta on 7/16/17.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();

        singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
