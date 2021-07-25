package com.isak.result;

/**
 * 结果对象
 */
public class Result {
    public boolean isRatify;    // 是否批准
    public String info;         // 审批意见

    public Result() {

    }

    public Result(boolean isRatify, String info) {
        super();
        this.isRatify = isRatify;
        this.info = info;
    }

    public boolean isRatify() {
        return isRatify;
    }

    public void setRatify(boolean ratify) {
        isRatify = ratify;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result{" +
                "isRatify=" + isRatify +
                ", info='" + info + '\'' +
                '}';
    }
}
