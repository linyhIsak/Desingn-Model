package com.abstracts;

import com.keybo.keybo;
import com.mouse.mouse;

/**
 * 声明一个抽象工厂(鼠标和键盘生产)
 */
public abstract class PcFactory {
    // 生产键盘
    abstract keybo createdKeybo();
    // 生产鼠标
    abstract mouse createdMouse();
}
