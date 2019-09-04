package com.lontyu.java.design.mode.chainOfResponsibility.demo2;

/**
 * @description: 乘坐汽车
 * @author: xiaoZongjin
 * @create: 2019-09-04
 */
public class CarGo extends AbstractGoHome {

    @Override
    public void goHome(String who) {
        System.out.println(who + ",乘坐汽车回家！");
        if (getNext() != null) {
            getNext().goHome(who);
        }
    }
}