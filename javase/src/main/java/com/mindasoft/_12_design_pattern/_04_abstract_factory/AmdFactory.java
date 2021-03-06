package com.mindasoft._12_design_pattern._04_abstract_factory;

/**
 * @author: min
 * @date: 2019/4/2 14:22
 * @version: 1.0.0
 */
public class AmdFactory implements ComputeFactory {

    @Override
    public Cpu createCpu() {
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(938);
    }
}
