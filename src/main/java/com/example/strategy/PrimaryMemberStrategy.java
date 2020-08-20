package com.example.strategy;

/**
 * @author tiger
 * @date 2020/8/20
 */
public class PrimaryMemberStrategy extends AbstractStrategy {

    @Override
    public double calcPrice(double price) {
        System.out.println("初级会员不配打折");
        return price;
    }
}
