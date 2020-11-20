package com.cybertek.controller;

import com.cybertek.datagenerator.DataGenerator;
import com.cybertek.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("userCreate")
    public String userCreate(Model model) {

        model.addAttribute("employee", new Employee());
        model.addAttribute("roleList", DataGenerator.getRoles());
        model.addAttribute("genderList", DataGenerator.getGenders());

        return "userCreate";

    }

    @PostMapping("userList")
    public String userList(@ModelAttribute("employee") Employee employee, Model model){

        model.addAttribute("employeeList", Arrays.asList(employee));

        return "userCreate";

    }

}
