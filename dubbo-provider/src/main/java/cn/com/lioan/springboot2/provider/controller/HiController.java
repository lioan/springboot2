package cn.com.lioan.springboot2.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2018/7/8.
 */

@RestController
public class HiController {

    @RequestMapping(value = "/")
    public String hi() {
        return "hi,spring boot2.1.0,provider.";
    }
}
