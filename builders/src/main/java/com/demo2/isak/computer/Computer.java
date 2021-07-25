package com.demo2.isak.computer;

/**
 * 计算机类
 */
public class Computer {
    private String cpu;         // cpu必须
    private String ram;         // 随机存储必须
    private int usbCount;       // usb接口可选
    private String keyboard;    // 键盘可选
    private String display;     // 显示器可选

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    public void setDisplay(String display) {
        this.display = display;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
