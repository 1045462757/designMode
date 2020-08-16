package com.example.singleton;

/**
 * 内部类单例模式
 *
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
        System.out.println("创建");
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("start");

        InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassSingleton2 = InnerClassSingleton.getInstance();

        System.out.println(innerClassSingleton1);
        System.out.println(innerClassSingleton2);
    }
}
