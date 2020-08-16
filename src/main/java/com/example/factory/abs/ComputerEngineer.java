package com.example.factory.abs;

import com.example.factory.abs.impl.AmdFactory;
import com.example.factory.abs.impl.IntelFactory;
import com.example.factory.simple.Cpu;
import com.example.factory.simple.MainBoard;

import java.util.Objects;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class ComputerEngineer {

    private Cpu cpu;

    private MainBoard mainBoard;

    public void makeComputer(AbstractFactory abstractFactory) {
        this.cpu = abstractFactory.createCpu();
        this.mainBoard = abstractFactory.createMainBoard();

        if (Objects.nonNull(cpu) && Objects.nonNull(mainBoard)) {
            this.cpu.calculate();
            this.mainBoard.installCpu();
        }
    }

    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory intelFactory = new IntelFactory();
        AbstractFactory amdFactory = new AmdFactory();
        computerEngineer.makeComputer(intelFactory);
        computerEngineer.makeComputer(amdFactory);
    }
}
