package com.isak.test;

import com.isak.factory.DlPhoneFactory;
import com.isak.factory.HpPhoneFactory;
import com.isak.factory.LxPhoneFactory;
import com.isak.phpne.DlPhone;
import com.isak.phpne.HpPhone;
import com.isak.phpne.LxPhone;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        DlPhoneFactory dlPhoneFactory = new DlPhoneFactory();
        DlPhone dlPhone = dlPhoneFactory.create();
        dlPhone.call();

        HpPhoneFactory hpPhoneFactory = new HpPhoneFactory();
        HpPhone hpPhone = hpPhoneFactory.create();
        hpPhone.call();

        LxPhoneFactory lxPhoneFactory = new LxPhoneFactory();
        LxPhone lxPhone = lxPhoneFactory.create();
        lxPhone.call();

    }
}
