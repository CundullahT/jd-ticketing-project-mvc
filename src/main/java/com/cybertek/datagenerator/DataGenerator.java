package com.cybertek.datagenerator;

import com.cybertek.enums.Gender;
import com.cybertek.enums.Role;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List getRoles(){

        List<Role> roleList = Arrays.asList(Role.ADMIN, Role.MANAGER, Role.EMPLOYEE);

        return roleList;

    }

    public static List getGenders(){

        List<Gender> genderList = Arrays.asList(Gender.MALE, Gender.FEMALE);

        return genderList;

    }

}
