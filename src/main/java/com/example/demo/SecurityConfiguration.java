package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.demo.services.UserServices;
import com.mysql.cj.protocol.AuthenticationProvider;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	@Autowired
	private UserServices userService;
	
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
	    http
	        .csrf().disable()
	        .authorizeRequests(registry ->{
	        	registry.antMatchers("/home").permitAll();
	        	registry.antMatchers("/home").permitAll();
	        }).formLogin(AbstractAuthenticationFilterConfigurer::permitAll)
	        .httpBasic();
	    
	    return http.build();
	}
	
//	@Bean
//	public UserDetailsService userDetailsService(){
//		UserDetails user =User.builder()
//		.username("ram")
//		.password("1234")
//		.roles("USER")
//		.build();
//		UserDetails admin =User.builder()
//		.username("admin")
//		.password("1234")
//		.roles("USER")
//		.build();
//		return new InMemoryUserDetailsManager(user,admin);
//	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		return userService;
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userService);
		provider.setPasswordEncoder(passwordEncoder());
		return  (AuthenticationProvider) provider;
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
}
