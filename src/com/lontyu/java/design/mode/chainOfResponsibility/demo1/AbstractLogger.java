package com.lontyu.java.design.mode.chainOfResponsibility.demo1;

/**
 * @description: 抽象类 日志输出基类
 * 责任链模式
 * @author: xiaoZongjin
 * @create: 2019-09-04
 */
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     *  责任链模式输出
     * @param level
     * @param message
     */
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }

        if (this.nextLogger != null) {
            this.nextLogger.logMessage(level, message);
        }

    }


    // 输出日志方法
    public abstract void write(String message);

}