package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.PortfolioEntry;
import com.wodric.cryptlaserbackend.domain.dto.PortfolioDto;
import com.wodric.cryptlaserbackend.domain.dto.PortfolioEntryDto;

import java.util.Collection;

public interface PortfolioEntryService {

	Collection<PortfolioEntry> findEntryForPorfolio (Portfolio portfolio);

	PortfolioEntry createPortfolioEntry (PortfolioEntryDto portfolioEntryDto);

	PortfolioEntry retrievePortfolioEntry(Long id);

	PortfolioEntry updatePortfolioEntry(PortfolioEntryDto portfolioEntryDto, Long id);

	void deletePortfolioEntry(Long id);
}
