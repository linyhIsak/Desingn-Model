package com.demo2.isak.test;

import com.demo2.isak.builder.MyComputerBuilder;
import com.demo2.isak.computer.Computer;

public class Test {
    public static void main(String[] args) {
        Computer lxComputer = new MyComputerBuilder("联想cpu", "联想ram")
                .setKeyboard("联想键盘")
                .setUsbCount(3)
                .setDisplay("联想显示器")
                .getComputer();

        Computer dlComputer = new MyComputerBuilder("戴尔cpu", "戴尔ram")
                .setKeyboard("戴尔键盘")
                .setUsbCount(2)
                .setDisplay("戴尔显示器")
                .getComputer();

        System.out.println(lxComputer);
        System.out.println(dlComputer);
    }
}
