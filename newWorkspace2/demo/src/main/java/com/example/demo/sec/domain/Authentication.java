package com.example.demo.sec.domain;

import java.security.Principal;
import java.util.Collection;

public interface Authentication extends Principal{
    // Collection<? extends GrantedAuthority> getAuthorities();
    
    // credentials(주로 비밀번호)을 가져옴
    Object getCredentials();
    
    Object getDetails();
    
    // Principal 객체를 가져옴.
    Object getPrincipal();
    
    // 인증 여부를 가져옴
    boolean isAuthenticated();
    
    // 인증 여부를 설정함
    void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException;
}
