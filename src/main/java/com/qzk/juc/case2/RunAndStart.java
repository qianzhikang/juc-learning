package com.qzk.juc.case2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description run方法和start方法的区别
 * @Date 2023-02-14-16-04
 * @Author qianzhikang
 */
@Slf4j
public class RunAndStart {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                log.debug("running...");
            }
        };
        t1.setName("thread1");

        // 直接调用run -> 还是由main线程来执行
        t1.run();

        // start方法 -> 开启一个thread1的线程来执行打印
        t1.start();
    }
}
