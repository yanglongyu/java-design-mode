package com.lontyu.java.design.mode.chainOfResponsibility.demo1;

/**
 * @description: FileLogger 文件输出类
 * @author: xiaoZongjin
 * @create: 2019-09-04
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("File print:" + message);
    }
}