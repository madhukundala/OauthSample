package com.OAuth.app.OAUTH2App;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableOAuth2Sso
@RestController
@Configuration
@ComponentScan
public class OAUTH2App 
{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(OAUTH2App.class, args);
    }
    
    

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().antMatcher("/**").authorizeRequests().antMatchers("/", "/login**", "/webjars/**")
//				.permitAll().anyRequest().authenticated().and().logout().logoutSuccessUrl("/").permitAll();
//	}
//
//	@RequestMapping("/user")
//	public Principal user(Principal principal) {
//		return principal;
//	}
}
