package com.wodric.cryptlaserbackend.repository;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

	List<Portfolio> findAllByUser_Id(long userId);
}
