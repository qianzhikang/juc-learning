package com.qzk.juc.case1;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description 创建线程的第三种方式（FutureTask和Callable配合Thread）这种方式可以带返回值
 * @Date 2023-02-14-14-33
 * @Author qianzhikang
 */
@Slf4j
public class CreateThreadMethod3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建FutureTask任务对象
        FutureTask<Integer> futureTask = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                log.debug("running...");
                // 暂停一秒
                Thread.sleep(1000);
                return 100;
            }
        });
        // 创建线程，添加任务
        Thread thread3 = new Thread(futureTask,"thread3");
        // 启动线程
        thread3.start();
        // 打印futuretask的返回值
        log.debug("{}",futureTask.get());
    }
}
