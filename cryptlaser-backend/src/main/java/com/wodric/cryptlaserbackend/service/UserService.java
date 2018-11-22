package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.User;
import com.wodric.cryptlaserbackend.domain.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface UserService {

	Collection<User> findAllUsers();

	User createUser(UserDto userDto);

	User retrieveUser(Long id);

	User updateUser(UserDto userDto, Long id);

	void deleteUser(Long id);
}
