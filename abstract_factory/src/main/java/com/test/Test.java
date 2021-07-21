package com.test;

import com.abstracts.DlFactory;
import com.abstracts.HpFactory;
import com.abstracts.LxFactory;
import com.keybo.DlKeybo;
import com.keybo.HpKeybo;
import com.keybo.LxKeybo;
import com.mouse.DlMouse;
import com.mouse.HpMouse;
import com.mouse.LxMouse;

public class Test {
    public static void main(String[] args) {
        HpFactory hpFactory = new HpFactory();
        HpKeybo hpKeybo = hpFactory.createdKeybo();
        HpMouse hpMouse = hpFactory.createdMouse();
        hpKeybo.keyboClick();
        hpMouse.mouseClicked();

        DlFactory dlFactory = new DlFactory();
        DlKeybo dlKeybo = dlFactory.createdKeybo();
        DlMouse dlMouse = dlFactory.createdMouse();
        dlKeybo.keyboClick();
        dlMouse.mouseClicked();

        LxFactory lxFactory = new LxFactory();
        LxKeybo lxKeybo = lxFactory.createdKeybo();
        LxMouse lxMouse = lxFactory.createdMouse();
        lxKeybo.keyboClick();
        lxMouse.mouseClicked();

    }
}
