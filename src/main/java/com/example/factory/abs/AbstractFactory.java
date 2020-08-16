package com.example.factory.abs;

import com.example.factory.simple.Cpu;
import com.example.factory.simple.MainBoard;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public interface AbstractFactory {

    /**
     * createCpu
     *
     * @return Cpu
     */
    Cpu createCpu();

    /**
     * createMainBoard
     *
     * @return MainBoard
     */
    MainBoard createMainBoard();
}
