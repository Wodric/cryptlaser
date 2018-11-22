package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.User;
import com.wodric.cryptlaserbackend.domain.dto.PortfolioDto;
import com.wodric.cryptlaserbackend.domain.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface PortfolioService {
	Collection<Portfolio> findAllPortfolioForUser(User user);

	Portfolio createPortfolio(PortfolioDto portfolioDto);

	Portfolio retrievePortfolio(Long id);

	Portfolio updatePortfolio(PortfolioDto portfolioDto, Long id);

	void deletePortfolio(Long id);
}
