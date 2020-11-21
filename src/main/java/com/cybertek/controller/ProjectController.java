package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("project")
public class ProjectController {

    @GetMapping({"/create", "/add", "/initialize"})
    public String userCreate() {


        return "project/create";

    }

    @PostMapping("/list")
    public String userList(){



        return "project/create";

    }

}
