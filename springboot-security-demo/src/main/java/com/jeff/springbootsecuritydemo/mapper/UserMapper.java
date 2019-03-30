package com.jeff.springbootsecuritydemo.mapper;

import com.jeff.springbootsecuritydemo.model.Role;
import com.jeff.springbootsecuritydemo.model.User;

import java.util.List;

public interface UserMapper {
    User findByUsername(String username);
    List<Role> findRolesByUser(User user);
}
