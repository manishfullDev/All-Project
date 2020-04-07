package com.fas.security.bean;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {
	protected String username;
	protected String password;
	protected String status;
	protected Set<GrantedAuthority> authorities;

	public UserDetailsImpl(String emailAddress, String password, String status, String roleName) {
		this.username = emailAddress;
		this.password = password;
		this.status = status;
		authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority(roleName));
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return status.equals("E") ? false : true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return status.equals("L") ? false : true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return status.equals("E") ? false : true;
	}

	@Override
	public boolean isEnabled() {
		return status.equals("A") ? true : false;
	}

}
