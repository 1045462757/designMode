package com.example.factory.simple;

import com.example.factory.simple.impl.AmdCpu;
import com.example.factory.simple.impl.IntelCpu;

/**
 * @author tiger
 * @version 1.0
 * @date 2020/8/16
 */
public class CpuFactory {

    public static Cpu createCpu(Integer cpuType) {
        switch (cpuType) {
            case Constant.INTEL_CPU_TYPE: {
                return new IntelCpu();
            }
            case Constant.AMD_CPU_TYPE: {
                return new AmdCpu();
            }
            default: {
                System.out.println("error cpuType");
                return null;
            }
        }
    }
}
