package app.core.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Roles implements GrantedAuthority {

	ROLE_USER, ROLE_DOC;

	@Override
	public String getAuthority() {
		return name();
	}

}
