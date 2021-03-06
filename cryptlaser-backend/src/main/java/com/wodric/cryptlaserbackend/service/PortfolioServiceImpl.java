package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.User;
import com.wodric.cryptlaserbackend.domain.dto.PortfolioDto;
import com.wodric.cryptlaserbackend.exception.EntityNotFoundException;
import com.wodric.cryptlaserbackend.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PortfolioServiceImpl implements PortfolioService {

	@Autowired
	private PortfolioRepository repository;

	@Override
	public List<Portfolio> findAllPortfoliosForUser(long userId) {
		return repository.findAllByUser_Id(userId);
	}

	@Override
	public Portfolio createPortfolio(PortfolioDto portfolioDto) {
		return repository.save(portfolioDto.toPortfolio());
	}

	@Override
	public Portfolio retrievePortfolio(Long id) {
		Optional<Portfolio> portfolio = repository.findById(id);

		if(!portfolio.isPresent()){
			throw new EntityNotFoundException(id, Portfolio.class);
		} else {
			return portfolio.get();
		}
	}

	@Override
	public Portfolio updatePortfolio(PortfolioDto portfolioDtoUpdated, Long id) {
		Optional<Portfolio> portfolio = repository.findById(id);

		if(!portfolio.isPresent()){
			throw new EntityNotFoundException(id, Portfolio.class);
		} else {
			portfolioDtoUpdated.setId(id);
			return repository.save(portfolioDtoUpdated.toPortfolio());
		}
	}

	@Override
	public void deletePortfolio(Long id) {
		repository.deleteById(id);
	}
}
