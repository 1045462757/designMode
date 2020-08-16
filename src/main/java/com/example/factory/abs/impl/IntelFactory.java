package com.example.factory.abs.impl;

import com.example.factory.abs.AbstractFactory;
import com.example.factory.simple.Cpu;
import com.example.factory.simple.MainBoard;
import com.example.factory.simple.impl.IntelCpu;
import com.example.factory.simple.impl.IntelMainBoard;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class IntelFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard();
    }
}
