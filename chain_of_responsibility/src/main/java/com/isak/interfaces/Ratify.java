package com.isak.interfaces;

import com.isak.request.Request;
import com.isak.result.Result;

/**
 * 声明接口: 处理请求
 */
public interface Ratify {
    // 处理请求，返回处理结果
    Result dealRequest(Chain chain);

    /**
     * 接口描述：对request和Result封装，用来转发
     */
    interface Chain {

        // 获取当前request
        Request getCurrentRequest();

        // 转发request
        Result proceedRequest(Request request);
    }

}
