package com.example.observer;

import com.example.observer.impl.SampleObserver;

/**
 * @author tiger
 * @date 2020/8/20
 */
public class SampleSubject extends AbstractSubject {

    private String state = "旧状态";

    public String getState() {
        return state;
    }

    public void change(String newState) {
        System.out.println("主题旧状态为：" + state);
        state = newState;
        System.out.println("主题新状态为：" + state);
        //状态发生改变，通知各个观察者
        this.notifyObservers();
    }

    public static void main(String[] args) {
        SampleSubject sampleSubject = new SampleSubject();
        SampleObserver sampleObserver = new SampleObserver();

        sampleSubject.attach(sampleObserver);

        sampleSubject.change("新状态");

        sampleSubject.detach(sampleObserver);

        sampleSubject.change("新状态2");
    }
}
