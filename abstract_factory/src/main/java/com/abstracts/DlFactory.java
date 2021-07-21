package com.abstracts;

import com.keybo.DlKeybo;
import com.mouse.DlMouse;

/**
 * 戴尔生产工厂（生产戴尔品牌鼠标和键盘）
 */
public class DlFactory extends PcFactory{
    @Override
    public DlKeybo createdKeybo() {
        return new DlKeybo();
    }

    @Override
    public DlMouse createdMouse() {
        return new DlMouse();
    }
}
