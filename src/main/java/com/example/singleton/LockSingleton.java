package com.example.singleton;

/**
 * 双重检查加锁单例模式
 *
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class LockSingleton {

    private volatile static LockSingleton instance = null;

    private LockSingleton() {
        System.out.println("创建");
    }

    public static LockSingleton getInstance() {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (instance == null) {
            //同步块，线程安全的创建实例
            synchronized (LockSingleton.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if (instance == null) {
                    instance = new LockSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("start");

        LockSingleton lockSingleton1 = LockSingleton.getInstance();
        LockSingleton lockSingleton2 = LockSingleton.getInstance();

        System.out.println(lockSingleton1);
        System.out.println(lockSingleton2);
    }
}
