package com.qzk.juc.case1;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 创建线程的第一种方式（匿名内部类）
 * @Date 2023-02-14-14-33
 * @Author qianzhikang
 */
@Slf4j
public class CreateThreadMethod1 {
    public static void main(String[] args) {

        // 匿名内部类创建线程
        Thread t = new Thread(){
            @Override
            public void run() {
                log.debug("running...");
            }
        };
        // 线程命名
        t.setName("thread1");

        // 启动线程
        t.start();

        log.debug("ending...");

    }
}
