package com.lontyu.java.design.mode.chainOfResponsibility.demo2;

/**
 * @description: 乘坐飞机
 * @author: xiaoZongjin
 * @create: 2019-09-04
 */
public class FlyGo extends AbstractGoHome {

    @Override
    public void goHome(String who) {
        System.out.println(who + ",乘坐飞机回家！");
        if (getNext() != null) {
            getNext().goHome(who);
        }
    }
}