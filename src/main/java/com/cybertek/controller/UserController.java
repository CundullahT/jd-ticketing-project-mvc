package com.cybertek.controller;

import com.cybertek.datagenerator.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping({"/create", "/add", "/initialize"})
    public String userCreate() {


        return "user/create";

    }

    @PostMapping("/list")
    public String userList(){



        return "user/create";

    }

}
