package cn.com.lioan.springboot2.consumer.controller;

import cn.com.lioan.springboot2.interfaces.HelloDubboService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/")
    public String hi() {
        return "hi,spring boot2.1.0,consumer.";
    }

    @Reference
    private HelloDubboService helloDubboService;

    @RequestMapping("/hello")
    public String hello(){
        String hello = helloDubboService.sayHello("Lioan");
        System.out.println(helloDubboService.sayHello("Lioan"));
        return hello;
    }
}
