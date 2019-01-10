package cn.com.lioan.springboot2.provider.service.impl;

import cn.com.lioan.springboot2.interfaces.HelloDubboService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class HelloDubboServiceImpl implements HelloDubboService {
    @Override
    public String sayHello(String name) {
        return "Hello Duboo " + name;
    }
}
