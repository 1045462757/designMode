package com.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tiger
 * @date 2020/8/20
 */
public abstract class AbstractSubject {

    private final List<Observer> list = new ArrayList<>();

    /**
     * 注册观察者对象
     *
     * @param observer 观察者对象
     */
    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("添加一个观察者");
    }

    /**
     * 删除观察者对象
     *
     * @param observer 观察者对象
     */
    public void detach(Observer observer) {
        list.remove(observer);
        System.out.println("删除一个观察者");
    }

    /**
     * 通知所有注册的观察者对象
     */
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}
