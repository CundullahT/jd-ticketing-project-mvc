package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("project")
public class ProjectController {

    @GetMapping("/create")
    public String projectCreate() {



        return "project/create";

    }

    @PostMapping("/list")
    public String projectList(){



        return "project/create";

    }

}
