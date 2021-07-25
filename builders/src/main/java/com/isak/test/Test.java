package com.isak.test;

import com.isak.builder.Computer;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer.Builder("因特尔","三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();

        Computer.Builder builder = new Computer.Builder("惠普", "ram");
        builder.setDisplay("惠普32寸");
        Computer build = builder.build();
        System.out.println(computer);
        System.out.println(build);
    }
}
