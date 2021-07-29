package com.isak.role;

import com.isak.interfaces.Ratify;
import com.isak.request.Request;
import com.isak.result.Result;

public class DepartmentHeader implements Ratify {
    @Override
    public Result dealRequest(Chain chain) {
        Request request = chain.getCurrentRequest();
        if (request.getDays() > 15) { // 如果请假天数>15天，直接不批准，返回
            return new Result(false, "你这个完全没必要");
        }
        // 如果请假天数days<15,则请求通过
        return new Result(true, "DepartmentHeader：不要着急，把事情处理完再回来！");
    }
}
