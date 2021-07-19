package com.itheima.jobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 任务类
 */
@Component
//@Slf4j = private static final Logger log = LoggerFactory.getLogger(MyJob.class);
@Slf4j
public class MyJob {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 任务触发时执行的方法
     * Scheduled:定时任务
     * CronTrigger:corn：七子表达式
     *  @Scheduled(cron = "0/2 * * * * ?")
     *
     * SimpleTrigger
     * initialDaley=启动后，延迟多长时间后才执行任务，单位是  ms
     * fixedRate=间隔多长时间后再执行 sleep(1000)
     * @Scheduled(initialDelay = 1000,fixedRate = 5000)
     *
     * 两者之间的区别：根据任务的紧要程度：SimpleTrigger > CornTrigger
     */
    @Scheduled(initialDelay = 1000,fixedRate = 5000)
    public void dojob(){
        log.info("执行了info");
        log.debug("执行了debug");
        log.error("执行了error");
        System.out.println("现在是：" + sdf.format(new Date()));
        log.info("结束了。。。");
    }
}
