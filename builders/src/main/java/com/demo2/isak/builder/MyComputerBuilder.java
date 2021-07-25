package com.demo2.isak.builder;

import com.demo2.isak.computer.Computer;

/**
 * 计算机建造者具体类
 */
public class MyComputerBuilder extends ComputerBuilder{

    private Computer computer;

    public MyComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }
    @Override
    public ComputerBuilder setUsbCount(int usbCount) {
        computer.setUsbCount(usbCount);
        return this;
    }

    @Override
    public ComputerBuilder setKeyboard(String keyboard) {
        computer.setKeyboard(keyboard);
        return this;
    }

    @Override
    public ComputerBuilder setDisplay(String display) {
        computer.setDisplay(display);
        return this;
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
