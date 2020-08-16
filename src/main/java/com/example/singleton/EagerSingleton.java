package com.example.singleton;

/**
 * 饿汉式单例模式
 *
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("创建");
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("start");

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton1);
        System.out.println(eagerSingleton2);
    }
}
