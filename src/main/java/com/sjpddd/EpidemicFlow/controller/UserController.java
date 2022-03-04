package com.sjpddd.EpidemicFlow.controller;

import com.sjpddd.EpidemicFlow.bean.User;
import com.sjpddd.EpidemicFlow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    //注册功能，保存数据
    public String register(String name, String password, String account, String repassword) {
        if (password.equals(repassword)) {
            //判断密码重复密码是否一致
            //未实现弹窗
            userService.register(name, password, account);
            return "RegisterSuccess";
        }
        return "RegisterFail";
    }

    @GetMapping("/login")
    //登录功能
    public String login(String account, String password) {
        ModelAndView mv = new ModelAndView();
        User user = userService.login(account, password);
        if (user != null) {
            mv.addObject("user", user);
            return "LoginSuccess";
        }
        return "LoginFail";
        //错误
        //未实现弹窗
    }
}