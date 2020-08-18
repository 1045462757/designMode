package com.example.adapter;

/**
 * @author tiger
 * @date 2020/8/18
 */
public class TargetAdapter extends AbstractTargetAdapter {

    @Override
    public void sample1() {
        System.out.println("sample1");
    }

    @Override
    public void sample2() {
        System.out.println("sample2");
    }

    public static void main(String[] args) {
        TargetAdapter targetAdapter = new TargetAdapter();
        targetAdapter.sample1();
        targetAdapter.sample2();
    }
}
