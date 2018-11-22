package com.wodric.cryptlaserbackend.domain.dto;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

	private long id;
	private String email;
	private String password;
	private Portfolio portfolio;

	public User toUser(){
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setPortfolio(portfolio);
		return user;
	}
}


