package com.example.observer;

/**
 * @author tiger
 * @date 2020/8/20
 */
public interface Observer {

    /**
     * update
     *
     * @param abstractSubject subject
     */
    void update(AbstractSubject abstractSubject);
}
