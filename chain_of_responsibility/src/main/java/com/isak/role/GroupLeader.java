package com.isak.role;

import com.isak.interfaces.Ratify;
import com.isak.request.Request;
import com.isak.result.Result;

/**
 * 组长
 */
public class GroupLeader implements Ratify {
    @Override
    public Result dealRequest(Chain chain) {
        Request request = chain.getCurrentRequest();
        if (request.getDays() > 2) {  //如果请假天数>2天，则自己过一遍请求，添加自己的相关意见，把请求交给上级处理
            // 转发处理
            return chain.proceedRequest(request);
        }
        // 如果请假天数days<2,则自己处理即可，不需交给上级处理
        return new Result(true, "GroupLeader：早去早回");
    }
}
