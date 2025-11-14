package org.dextris.singleton;

public class LazySingleton {

    private static LazySingleton instance=null;

    private LazySingleton(){
        System.out.println("Create private Constructor");
    }

    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }

    public static void main(String[]args){
        LazySingleton lazySingleton=new LazySingleton();
        LazySingleton lazySingleton1=new LazySingleton();

        System.out.println(lazySingleton.getInstance().hashCode());
        System.out.println(lazySingleton1.getInstance().hashCode());

        LazySingleton.getInstance();
    }
}
