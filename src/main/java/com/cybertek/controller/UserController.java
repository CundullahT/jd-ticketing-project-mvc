package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
