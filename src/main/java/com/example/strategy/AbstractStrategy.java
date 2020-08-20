package com.example.strategy;

/**
 * @author tiger
 * @date 2020/8/20
 */
public abstract class AbstractStrategy {

    /**
     * 计算打折价格
     *
     * @param price price
     * @return price
     */
    public abstract double calcPrice(double price);
}
