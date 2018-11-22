package com.wodric.cryptlaserbackend.repository;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}
