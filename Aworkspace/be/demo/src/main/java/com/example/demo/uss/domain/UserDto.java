package com.example.demo.uss.domain;

import java.io.Serializable;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private long userNo;
    private String username;
    private String password;
    private String authority;
    private boolean enabled;
    private String name;
    private String email;
    private String birthday;
    private String gender;
    private boolean accountNonExpire;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean accountNonExpired;
}
