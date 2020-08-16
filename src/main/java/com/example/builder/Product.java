package com.example.builder;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class Product {

    private final String part1;

    private final String part2;

    private Product(Builder builder) {
        this.part1 = builder.part1;
        this.part2 = builder.part2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                '}';
    }

    public static class Builder {

        private String part1;

        private String part2;

        public void buildPart1(String part1) {
            this.part1 = part1;
        }

        public void buildPart2(String part2) {
            this.part2 = part2;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
