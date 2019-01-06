package cn.com.lioan.springboot2.web.controller;

import cn.com.lioan.springboot2.web.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HtmlController {

    //测试html
    @GetMapping("/home")
    public String home(HttpServletRequest request){
        request.setAttribute("title", "我的第一个Thymeleaf模板页面");
        request.setAttribute("desc", "欢迎进入lshop 系统");
        User user = new User();
        user.setName("lixx");
        user.setPhone("18888888888");
        user.setAge(32);
        request.setAttribute("user", user);
        return "test";
    }
    /*@GetMapping("/home1")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        view.setViewName("pages/test");
        view.addObject("title", "我的第一个WEB页面");
        List<User> users = new ArrayList<>();
        User u1 = new User();
        u1.setName("lixx");
        u1.setPhone("18888888888");
        u1.setAge(32);
        User u2 = new User();
        u2.setName("liss");
        u2.setPhone("18688888888");
        u2.setAge(29);
        users.add(u1);
        users.add(u2);
        view.addObject("users", users);
        return view;
    }*/
    @GetMapping("/home1")
    public String home1(HttpServletRequest request){
        return "html/test";
    }
}
