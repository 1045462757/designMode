package com.example.singleton;

/**
 * 懒汉式单例模式
 *
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
        System.out.println("创建");
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("start");

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);
    }
}
