package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.dto.PortfolioDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PortfolioService {

	List<Portfolio> findAllPortfoliosForUser(long userId);

	Portfolio createPortfolio(PortfolioDto portfolioDto);

	Portfolio retrievePortfolio(Long id);

	Portfolio updatePortfolio(PortfolioDto portfolioDto, Long id);

	void deletePortfolio(Long id);
}
