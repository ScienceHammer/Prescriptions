package app.core.models;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import app.core.entities.User;

public class CustomeUserDetails implements UserDetails {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String username;
	private String password;
	private boolean active;
	private List<GrantedAuthority> authorities;
	
	

	public CustomeUserDetails(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.active = user.isActive();
		this.authorities = Arrays.stream(user.getRole().toString().split(",")).map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
	}

	public CustomeUserDetails() {
	}
	
	

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return active;
	}

	@Override
	public String toString() {
		return "CustomeUserDetails [id=" + id + ", username=" + username + ", password=" + password + ", active="
				+ active + ", authorities=" + authorities + "]";
	}
	
	
	
	

}
