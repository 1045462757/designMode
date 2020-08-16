package com.example.builder;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class Director {

    public static void main(String[] args) {

        Product.Builder builder = new Product.Builder();
        builder.buildPart1("hello");
        builder.buildPart2("world");
        Product product = builder.build();

        System.out.println(product);
    }
}
