package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.User;
import com.wodric.cryptlaserbackend.domain.dto.UserDto;
import com.wodric.cryptlaserbackend.exception.EntityNotFoundException;
import com.wodric.cryptlaserbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repository;

	@Override
	public Collection<User> findAllUsers() {
		return repository.findAll();
	}

	@Override
	public User createUser(UserDto userDto) {
		return repository.save(userDto.toUser());
	}

	@Override
	public User retrieveUSer(Long id) {
		Optional<User> user = repository.findById(id);

		if(!user.isPresent()){
			throw new EntityNotFoundException(id, User.class);
		} else {
			return user.get();
		}
	}

	@Override
	public User updateUser(UserDto userDtoUpdated, Long id) {
		Optional<User> user = repository.findById(id);

		if(!user.isPresent()){
			throw new EntityNotFoundException(id, User.class);
		} else {
			userDtoUpdated.setId(id);
			return repository.save(userDtoUpdated.toUser());
		}
	}

	@Override
	public void deleteUser(Long id) {
		deleteUser(id);
	}
}
