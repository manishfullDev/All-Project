package com.faa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().formLogin().loginPage("/login-page.htm").loginProcessingUrl("/login")
				.defaultSuccessUrl("/home.htm").usernameParameter("j_username").passwordParameter("j_password").and()
				.authorizeRequests().antMatchers("/list-projects.htm").access("hasAuthority('MANAGER')")
				.antMatchers("/home.htm").permitAll().and().logout().logoutUrl("/logout")
				.logoutSuccessUrl("/logout.htm");

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("john").password("welcome1").authorities("MANAGER").and()
				.withUser("mathew").password("welcome1").authorities("MEMBER");
	}

}









