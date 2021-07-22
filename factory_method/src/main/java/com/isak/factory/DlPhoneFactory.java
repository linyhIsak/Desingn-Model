package com.isak.factory;

import com.isak.phpne.DlPhone;

/**
 * 戴尔手机生产工厂
 */
public class DlPhoneFactory implements PhoneFactory{
    @Override
    public DlPhone create() {
        return new DlPhone();
    }
}
