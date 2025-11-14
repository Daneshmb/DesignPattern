package org.dextris.singleton;

public class MultiThreadSingleton {

    private static volatile MultiThreadSingleton instance=null;

    private MultiThreadSingleton(){
        System.out.println("Create private Constructor");
    }

    public static MultiThreadSingleton getInstance(){
        if(instance==null){
            synchronized (MultiThreadSingleton.class){
                if(instance==null){
                    instance=new MultiThreadSingleton();
                }
            }

        }
        return instance;
    }

    public static void main(String[] args){
        System.out.println(MultiThreadSingleton.getInstance().hashCode());
    }
}
