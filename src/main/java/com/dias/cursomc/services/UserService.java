package com.dias.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.dias.cursomc.security.UserSS;

public class UserService {
	public static UserSS authenticated() {
		try {
		return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch(Exception ex) {
			return null;
		}
	}
}
