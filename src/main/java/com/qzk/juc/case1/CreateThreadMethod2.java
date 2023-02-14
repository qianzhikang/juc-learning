package com.qzk.juc.case1;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 创建线程的第二种方式（Runnable配合Thread）
 * @Date 2023-02-14-14-33
 * @Author qianzhikang
 */
@Slf4j
public class CreateThreadMethod2 {
    public static void main(String[] args) {

        // 创建runnable 任务对象
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log.debug("hello");
            }
        };
        // lambda方式创建runnable对象
        runnable = () -> log.debug("hello");

        // 创建线程对象，线程命名
        Thread t = new Thread(runnable, "thread2");
        // 启动线程
        t.start();
        log.debug("ending...");

    }
}
