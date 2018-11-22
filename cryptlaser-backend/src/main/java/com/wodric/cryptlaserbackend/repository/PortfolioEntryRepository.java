package com.wodric.cryptlaserbackend.repository;

import com.wodric.cryptlaserbackend.domain.PortfolioEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioEntryRepository extends JpaRepository<PortfolioEntry, Long> {
}
