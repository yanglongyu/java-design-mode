package com.lontyu.java.design.mode.chainOfResponsibility.demo2;

/**
 * @description: 回家方式
 * @author: xiaoZongjin
 * @create: 2019-09-04
 */
public class GoHomeWayTest {

    public static void main(String[] args) {
        AbstractGoHome flyGo = new FlyGo();
        AbstractGoHome carGo = new CarGo();
        AbstractGoHome walkGo = new WalkGo();

        // 先飞机，汽车，步行
        flyGo.setNext(carGo);
        carGo.setNext(walkGo);

        flyGo.goHome("小明");
    }
}