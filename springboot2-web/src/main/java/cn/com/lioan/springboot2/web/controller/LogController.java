package cn.com.lioan.springboot2.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2018/8/12.
 */
@RestController
public class LogController {
    private Logger logger = LoggerFactory.getLogger(HiController.class);

    @RequestMapping("/log")
    public String log() {
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR(FATAL)，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        return "logger";
    }

}
