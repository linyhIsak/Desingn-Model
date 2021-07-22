package com.isak.factory;

import com.isak.phpne.LxPhone;

/**
 * 联想手机生产工厂
 */
public class LxPhoneFactory implements PhoneFactory{
    @Override
    public LxPhone create() {
        return new LxPhone();
    }
}
