package com.example.observer.impl;

import com.example.observer.AbstractSubject;
import com.example.observer.Observer;
import com.example.observer.SampleSubject;

/**
 * @author tiger
 * @date 2020/8/20
 */
public class SampleObserver implements Observer {

    private String observerState = "旧状态";

    @Override
    public void update(AbstractSubject abstractSubject) {
        System.out.println("观察者旧状态:" + observerState);
        this.observerState = ((SampleSubject) abstractSubject).getState();
        System.out.println("观察者新状态:" + observerState);
    }
}
