package com.example.factory.abs.impl;

import com.example.factory.abs.AbstractFactory;
import com.example.factory.simple.Cpu;
import com.example.factory.simple.MainBoard;
import com.example.factory.simple.impl.AmdCpu;
import com.example.factory.simple.impl.AmdMainBoard;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard();
    }
}
