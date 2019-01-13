package cn.com.lioan.springboot2.web.controller;

import cn.com.lioan.springboot2.dao.model.Lioaner;
import cn.com.lioan.springboot2.service.LioanerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2018/7/8.
 */

@RestController
public class HiController {

    @Autowired
    LioanerService lioanerService;

    @RequestMapping(value = "/")
    public String hi() {
        return "hi,spring boot2.1.0，springbboot2.";
    }

    //测试mybatis
    @RequestMapping("/lioans")
    public List<Lioaner> getLioaners() {
        return lioanerService.getLioaners();
    }
    @RequestMapping("/lioans1")
    public List<Lioaner> getLioaners1() {
        return lioanerService.getLioaners1();
    }
    @RequestMapping("/lioaner/{id}")
    public Lioaner getLioanerById(@PathVariable String id){
        return lioanerService.getLioanerById(id);
    }

    //返回map：包括表字段和运算结果
    @RequestMapping(value = "/lm", method = {RequestMethod.GET})
    public List<Map<String,Object>> getCountBySex(){
        return lioanerService.getCountBySex();
    }

    @RequestMapping("/lnm")
    public Map<String, Lioaner> getLioanMaps(){
        return lioanerService.getLioanMaps();
    }

    //测试多数据源
    /*@Autowired
    private LioanerOneMapper lioanerOneMapper;
    @Autowired
    private LioanerTwoMapper lioanerTwoMapper;
    @RequestMapping("/multi/{id}")
    public Map<String, Lioaner> multi(@PathVariable String id) {
        Map<String, Lioaner> result = new HashMap<>();
        //第一个数据源
        Lioaner oneLioaner = lioanerOneMapper.selectByPrimaryKey(id);
        //第二个数据源
        Lioaner twoLioaner = lioanerTwoMapper.selectByPrimaryKey(id);

        result.put("one", oneLioaner);
        result.put("two", twoLioaner);

        return result;
    }*/
}
