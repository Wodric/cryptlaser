package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.User;
import com.wodric.cryptlaserbackend.domain.dto.CurrencyDto;
import com.wodric.cryptlaserbackend.domain.dto.UserDto;

import java.util.Collection;

public interface UserService {

	Collection<User> findAllUsers();

	User createUser(UserDto userDto);

	User retrieveUSer(Long id);

	User updateUser(UserDto userDto, Long id);

	void deleteUser(Long id);
}
