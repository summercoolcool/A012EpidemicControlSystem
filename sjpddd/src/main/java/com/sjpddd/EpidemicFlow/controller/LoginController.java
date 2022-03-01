package com.sjpddd.EpidemicFlow.controller;

import com.sjpddd.EpidemicFlow.entity.Login;
import com.sjpddd.EpidemicFlow.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login")
    public String login(Login login) {
        ModelAndView mv = new ModelAndView();
        login = loginService.get(login);

        if (login != null) {
            mv.addObject("login", login);
            return "LoginSuccess";
        } else {
            return "LoginFail";
        }
    }
}