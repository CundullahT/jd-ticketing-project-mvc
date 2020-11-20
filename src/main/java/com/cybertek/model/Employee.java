package com.cybertek.model;

import com.cybertek.enums.Gender;
import com.cybertek.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    private String firstName;
    private String lastName;
    private Gender gender;
    private String email;
    private String password;
    private String phoneNumber;
    private Role role;

}
