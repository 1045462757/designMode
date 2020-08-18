package com.example.adapter;

/**
 * @author tiger
 * @date 2020/8/18
 */
public class Adapter implements Target {

    private final Sample sample = new Sample();

    @Override
    public void sample1() {
        sample.sample1();
    }

    @Override
    public void sample2() {
        System.out.println("sample2");
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.sample1();
        adapter.sample2();
    }
}
