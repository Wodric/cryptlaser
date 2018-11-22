package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.PortfolioEntry;
import com.wodric.cryptlaserbackend.domain.dto.PortfolioEntryDto;

import java.util.List;

public interface PortfolioEntryService {

	List<PortfolioEntry> findEntryForPortfolioId (Long portfolioId);

	PortfolioEntry createPortfolioEntry (PortfolioEntryDto portfolioEntryDto);

	PortfolioEntry retrievePortfolioEntry(Long id);

	PortfolioEntry updatePortfolioEntry(PortfolioEntryDto portfolioEntryDto, Long id);

	void deletePortfolioEntry(Long id);
}
