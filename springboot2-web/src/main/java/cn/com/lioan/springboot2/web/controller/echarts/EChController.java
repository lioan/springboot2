package cn.com.lioan.springboot2.web.controller.echarts;

import cn.com.lioan.springboot2.service.LioanerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class EChController {

    @Autowired
    LioanerService lioanerService;

    @GetMapping("/e1")
    public String e1(HttpServletRequest request){
        return "echarts/echart_1";
    }

    @GetMapping("/e2")
    @ResponseBody
    public List<Map<String,Object>> getCountBySex(){
        return lioanerService.getCountBySex();
    }

}
