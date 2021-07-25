package com.isak.interfacesImpl;

import com.isak.interfaces.Ratify;
import com.isak.request.Request;
import com.isak.result.Result;

import java.util.List;


public class RealChain implements Ratify.Chain {

    public Request request;
    public List<Ratify> ratifyList;
    public int index;

    public RealChain(List<Ratify> ratifyList, Request request, int index) {
        this.ratifyList = ratifyList;
        this.request = request;
        this.index = index;
    }

    @Override
    public Request getCurrentRequest() {
        return request;
    }

    @Override
    public Result proceedRequest(Request request) {
        Result proceed = null;
        if (ratifyList.size() > index) {
            RealChain realChain = new RealChain(ratifyList, request, index + 1);
            Ratify ratify = ratifyList.get(index);
            proceed = ratify.dealRequest(realChain);
        }
        return proceed;
    }
}
