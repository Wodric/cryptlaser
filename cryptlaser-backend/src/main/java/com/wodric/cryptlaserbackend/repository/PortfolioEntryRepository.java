package com.wodric.cryptlaserbackend.repository;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.PortfolioEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface PortfolioEntryRepository extends JpaRepository<PortfolioEntry, Long> {

	Collection<PortfolioEntry> findAllByPortfolio(Portfolio portfolio);
}
