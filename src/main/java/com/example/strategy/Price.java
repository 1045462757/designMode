package com.example.strategy;

/**
 * @author tiger
 * @date 2020/8/20
 */
public class Price {

    private AbstractStrategy strategy;

    public Price(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double price) {
        return strategy.calcPrice(price);
    }

    public static void main(String[] args) {
        AbstractStrategy primaryMemberStrategy = new PrimaryMemberStrategy();
        AbstractStrategy middleMemberStrategy = new MiddleMemberStrategy();
        AbstractStrategy seniorMemberStrategy = new SeniorMemberStrategy();

        Price price = new Price(seniorMemberStrategy);

        double quotePrice = price.quote(300);

        System.out.println("打折后:" + quotePrice);
    }
}
