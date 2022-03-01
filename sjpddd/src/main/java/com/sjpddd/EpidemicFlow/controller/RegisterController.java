package com.sjpddd.EpidemicFlow.controller;

import com.sjpddd.EpidemicFlow.RegisterRepository;
import com.sjpddd.EpidemicFlow.entity.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @Autowired
    RegisterRepository registerRepository;

    @RequestMapping("/register")
    public String insertUser(Register register){
        Register save = registerRepository.save(register);
        return "RegisterSuccess";
    }
}




