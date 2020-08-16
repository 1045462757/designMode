package com.example.factory.simple.impl;

import com.example.factory.simple.Cpu;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class IntelCpu implements Cpu {

    @Override
    public void calculate() {
        System.out.println("Intel Cpu");
    }
}
