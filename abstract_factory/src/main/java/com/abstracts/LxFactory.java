package com.abstracts;

import com.keybo.LxKeybo;
import com.mouse.LxMouse;

/**
 * 联想生产工厂（生产联想品牌鼠标和键盘）
 */
public class LxFactory extends PcFactory{
    @Override
    public LxKeybo createdKeybo() {
        return new LxKeybo();
    }

    @Override
    public LxMouse createdMouse() {
        return new LxMouse();
    }
}
