package com.demo2.isak.builder;

import com.demo2.isak.computer.Computer;

/**
 * 声明计算机建造者抽象类
 */
public abstract class ComputerBuilder {
    public abstract ComputerBuilder setUsbCount(int usbCount);
    public abstract ComputerBuilder setKeyboard(String keyboard);
    public abstract ComputerBuilder setDisplay(String display);

    public abstract Computer getComputer();
}
