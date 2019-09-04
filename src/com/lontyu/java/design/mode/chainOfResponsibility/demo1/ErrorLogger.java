package com.lontyu.java.design.mode.chainOfResponsibility.demo1;

/**
 * @description: ErrorLogger 输出类
 * @author: xiaoZongjin
 * @create: 2019-09-04
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Error print:" + message);
    }
}