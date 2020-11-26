package com.cybertek.controller;

import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.service.RoleService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user",new UserDTO());
        model.addAttribute("roles",roleService.findAll());
        model.addAttribute("users",userService.findAll());

        return "/user/create";
    }

    @PostMapping("/create")
    public String insertUser(UserDTO user,Model model){
        userService.save(user);
        return "redirect:/user/create";
    }

    @GetMapping("/update/{username}")
    public String editUser(@PathVariable("username") String username,Model model){

        model.addAttribute("user",userService.findById(username));
        model.addAttribute("users",userService.findAll());
        model.addAttribute("roles",roleService.findAll());

        return "/user/update";

    }

    @PostMapping("/update/{username}")
    public String updateUser(@PathVariable("username") String username,UserDTO user,Model model){
        userService.update(user);
        return "redirect:/user/create";
    }

    @GetMapping("/delete/{username}")
    public String deleteUser(@PathVariable("username") String username){
        userService.deleteById(username);
        return "redirect:/user/create";
    }






















}
