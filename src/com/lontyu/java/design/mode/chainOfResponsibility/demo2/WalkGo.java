package com.lontyu.java.design.mode.chainOfResponsibility.demo2;

/**
 * @description: 走路回家
 * @author: xiaoZongjin
 * @create: 2019-09-04
 */
public class WalkGo extends AbstractGoHome {

    @Override
    public void goHome(String who) {
        System.out.println(who + ",走路回家！");
        if (getNext() != null) {
            getNext().goHome(who);
        }
    }
}