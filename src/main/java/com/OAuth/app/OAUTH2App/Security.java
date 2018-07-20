package com.OAuth.app.OAUTH2App;

import java.security.Principal;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableWebSecurity
@RestController
@Configuration
public class Security extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().antMatcher("/**").authorizeRequests().antMatchers("/", "/login**", "/webjars/**")
				.permitAll().anyRequest().authenticated().and().logout().logoutSuccessUrl("/").permitAll();
	}

	@RequestMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}
}
