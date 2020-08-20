package com.example.strategy;

/**
 * @author tiger
 * @date 2020/8/20
 */
public class SeniorMemberStrategy extends AbstractStrategy {

    @Override
    public double calcPrice(double price) {
        System.out.println("高级会员打8折");
        return price * 0.8;
    }
}
