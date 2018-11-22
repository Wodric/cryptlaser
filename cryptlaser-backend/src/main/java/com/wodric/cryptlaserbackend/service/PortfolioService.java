package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.User;
import com.wodric.cryptlaserbackend.domain.dto.PortfolioDto;
import com.wodric.cryptlaserbackend.domain.dto.UserDto;

import java.util.Collection;

public interface PortfolioService {
	Collection<Portfolio> findAllPortfolioForUser(User user);

	Portfolio createPortfolio(PortfolioDto portfolioDto);

	Portfolio retrievePortfolio(Long id);

	Portfolio updatePortfolio(PortfolioDto portfolioDto, Long id);

	void deleteCurrency(Long id);
}
