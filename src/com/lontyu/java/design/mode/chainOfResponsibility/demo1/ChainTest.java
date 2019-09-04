package com.lontyu.java.design.mode.chainOfResponsibility.demo1;

/**
 * @description: 责任链测试类
 * @author: xiaoZongjin
 * @create: 2019-09-04
 */
public class ChainTest {

    public static void main(String[] args) {

        AbstractLogger chainLogger = getChainLogger();

        chainLogger.logMessage(AbstractLogger.ERROR, "你好！");

        System.out.println("------------------");

        chainLogger.logMessage(AbstractLogger.DEBUG, "你好123！");

        System.out.println("------------------");

        chainLogger.logMessage(AbstractLogger.INFO, "你好345！");

    }

    private static AbstractLogger getChainLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}