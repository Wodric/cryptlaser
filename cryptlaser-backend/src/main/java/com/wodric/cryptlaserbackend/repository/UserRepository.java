package com.wodric.cryptlaserbackend.repository;

import com.wodric.cryptlaserbackend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
