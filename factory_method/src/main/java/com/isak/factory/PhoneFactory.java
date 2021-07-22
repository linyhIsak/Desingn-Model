package com.isak.factory;

import com.isak.phpne.Phone;

/**
 * 声明一个生产手机的接口
 */
public interface PhoneFactory {
    // 生产手机方法
    Phone create();
}
