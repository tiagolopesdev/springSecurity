/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springSecurity.springSecurity.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 *
 * @author tiagolopes
 */
//@Configuration
public class InMemorySecurityConfig {
    
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception{
//        builder.inMemoryAuthentication()
//                .passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .withUser("tiago").password("123").roles("USER")
//                .and()
//                .withUser("geovana").password("321").roles("ADMIN","USER");
//    }
    
}
