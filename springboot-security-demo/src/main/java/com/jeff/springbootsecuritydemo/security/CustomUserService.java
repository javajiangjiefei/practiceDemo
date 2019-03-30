package com.jeff.springbootsecuritydemo.security;

import com.jeff.springbootsecuritydemo.mapper.UserMapper;
import com.jeff.springbootsecuritydemo.model.Role;
import com.jeff.springbootsecuritydemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CustomUserService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.findByUsername(username);
        if(user==null){
            throw new UsernameNotFoundException(username+"user is not exists");
        }
        List<Role> roleList = userMapper.findRolesByUser(user);
        user.setRoles(roleList);
        List<GrantedAuthority> auths = new ArrayList<>();
        List<Role> roles = user.getRoles();
        for (Role role:roles
             ) {
            auths.add(new SimpleGrantedAuthority(role.getRoleFlag()));
        }
        return new org.springframework.security.core.userdetails.User(user.getName(),
                user.getPassword(), auths);
    }
}
