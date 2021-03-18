package com.example.demo.uss.domain;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class UserDto implements UserDetails{
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
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
        
        auth.add(new SimpleGrantedAuthority(authority));
        return auth;
	}
}
