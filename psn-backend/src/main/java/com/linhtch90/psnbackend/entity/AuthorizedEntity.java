package com.linhtch90.psnbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizedEntity {
    private UserEntity user;
    private String token;
    
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public AuthorizedEntity(UserEntity user, String token) {
		super();
		this.user = user;
		this.token = token;
	}
	public AuthorizedEntity() {
		
	}
    
}
