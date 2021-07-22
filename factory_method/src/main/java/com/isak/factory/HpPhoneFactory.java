package com.isak.factory;

import com.isak.phpne.HpPhone;

/**
 * 惠普手机生产工厂
 */
public class HpPhoneFactory implements PhoneFactory{
    @Override
    public HpPhone create() {
        return new HpPhone();
    }
}
