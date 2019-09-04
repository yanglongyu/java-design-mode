package com.lontyu.java.design.mode.chainOfResponsibility.demo1;

/**
 * @description: ConsoleLogger 控制台输出类
 * @author: xiaoZongjin
 * @create: 2019-09-04
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Console print:" + message);
    }
}