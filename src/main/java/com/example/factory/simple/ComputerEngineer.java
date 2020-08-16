package com.example.factory.simple;

import java.util.Objects;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class ComputerEngineer {

    private Cpu cpu;

    private MainBoard mainBoard;

    public void makeComputer(int cpuType, int mainBoardType) {
        this.cpu = CpuFactory.createCpu(cpuType);
        this.mainBoard = MainBoardFactory.createMainBoard(mainBoardType);

        if (Objects.nonNull(cpu) && Objects.nonNull(mainBoard)) {
            this.cpu.calculate();
            this.mainBoard.installCpu();
        }
    }

    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        computerEngineer.makeComputer(Constant.INTEL_CPU_TYPE, Constant.INTEL_MAIN_BOARD_TYPE);
    }
}
