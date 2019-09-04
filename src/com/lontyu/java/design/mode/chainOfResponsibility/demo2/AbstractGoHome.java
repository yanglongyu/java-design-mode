package com.lontyu.java.design.mode.chainOfResponsibility.demo2;

/**
 * @description: 放假过节回家
 * @author: xiaoZongjin
 * @create: 2019-09-04
 */
public abstract class AbstractGoHome {

    protected AbstractGoHome next;

    public AbstractGoHome getNext() {
        return next;
    }

    public void setNext(AbstractGoHome next) {
        this.next = next;
    }

    /**
     *  谁回家
     * @param who
     */
    public abstract void goHome(String who);
}