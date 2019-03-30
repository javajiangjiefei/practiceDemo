package com.jeff.springbootsecuritydemo.model;



import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private long id;
    private String name;
    private String password;
    private List<Role> roles;
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
