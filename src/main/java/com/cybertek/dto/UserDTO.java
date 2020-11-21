package com.cybertek.dto;

import com.cybertek.entity.Role;
import com.cybertek.enums.Gender;

public class UserDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;

}
