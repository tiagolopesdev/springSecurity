/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springSecurity.springSecurity.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import springSecurity.springSecurity.model.Users;

/**
 *
 * @author tiagolopes
 */
public class UserDetail implements UserDetails {

    private Users users;

    public UserDetail(Users users) {
        this.users = users;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> autorities = new ArrayList<>();
        this.users.getRole().forEach(r -> {
            autorities.add(new SimpleGrantedAuthority(r.getName()));             
        });        
        return autorities;
    }

    @Override
    public String getPassword() {        
        return this.users.getPassword();
    }

    @Override
    public String getUsername() {
        return this.users.getLogin();        
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.users.isAtivo();
    }

}
