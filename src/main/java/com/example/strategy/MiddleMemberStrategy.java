package com.example.strategy;

/**
 * @author tiger
 * @date 2020/8/20
 */
public class MiddleMemberStrategy extends AbstractStrategy {

    @Override
    public double calcPrice(double price) {
        System.out.println("中级会员打9折");
        return price * 0.9;
    }
}
