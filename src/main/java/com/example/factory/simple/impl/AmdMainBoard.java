package com.example.factory.simple.impl;

import com.example.factory.simple.MainBoard;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class AmdMainBoard implements MainBoard {

    @Override
    public void installCpu() {
        System.out.println("install Amd Cpu");
    }
}
