package com.wodric.cryptlaserbackend.repository;

import com.wodric.cryptlaserbackend.domain.PortfolioEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortfolioEntryRepository extends JpaRepository<PortfolioEntry, Long> {

	List<PortfolioEntry> findAllByPortfolio_Id(long portfolioId);
}
