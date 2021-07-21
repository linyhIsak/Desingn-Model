package com.abstracts;

import com.keybo.HpKeybo;
import com.mouse.HpMouse;

/**
 * 惠普生产工厂（生产惠普品牌鼠标和键盘）
 */
public class HpFactory extends PcFactory{
    @Override
    public HpKeybo createdKeybo() {
        return new HpKeybo();
    }

    @Override
    public HpMouse createdMouse() {
        return new HpMouse();
    }
}
