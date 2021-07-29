package com.isak.test;

import com.isak.request.Request;
import com.isak.result.Result;
import com.isak.utils.ChainOfResponsibilityClient;

public class Test {
    public static void main(String[] args) {
        Request request = new Request.Builder().setName("张三").setDays(4)
                .setReason("事假").build();
        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
        Result result = client.execute(request);
        System.out.println(result);
    }
}
