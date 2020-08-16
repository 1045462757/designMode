package com.example.factory.simple;

import com.example.factory.simple.impl.AmdMainBoard;
import com.example.factory.simple.impl.IntelMainBoard;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class MainBoardFactory {

    /**
     * createMainBoard
     */
    public static MainBoard createMainBoard(int mainBoardType) {
        switch (mainBoardType) {
            case Constant.INTEL_MAIN_BOARD_TYPE: {
                return new IntelMainBoard();
            }
            case Constant.AMD_MAIN_BOARD_TYPE: {
                return new AmdMainBoard();
            }
            default: {
                System.out.println("error mainBoardType");
                return null;
            }
        }
    }
}
