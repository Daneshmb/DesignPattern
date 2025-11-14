package org.dextris.singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Create private Constructor");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(EagerSingleton.getInstance().hashCode());
    }
}