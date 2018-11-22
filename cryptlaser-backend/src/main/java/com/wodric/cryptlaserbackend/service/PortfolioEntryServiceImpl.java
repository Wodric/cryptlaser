package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.PortfolioEntry;
import com.wodric.cryptlaserbackend.domain.dto.PortfolioEntryDto;
import com.wodric.cryptlaserbackend.exception.EntityNotFoundException;
import com.wodric.cryptlaserbackend.repository.PortfolioEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PortfolioEntryServiceImpl implements PortfolioEntryService {

	@Autowired
	PortfolioEntryRepository repository;

	@Override
	public Collection<PortfolioEntry> findEntryForPorfolio(Portfolio portfolio) {
		return repository.findAllByPortfolio(portfolio);
	}

	@Override
	public PortfolioEntry createPortfolioEntry(PortfolioEntryDto portfolioEntryDto) {
		return repository.save(portfolioEntryDto.toPortfolioEntry());
	}

	@Override
	public PortfolioEntry retrievePortfolioEntry(Long id) {
		Optional<PortfolioEntry> portfolioEntry = repository.findById(id);

		if(!portfolioEntry.isPresent()){
			throw new EntityNotFoundException(id, PortfolioEntry.class);
		} else {
			return portfolioEntry.get();
		}
	}

	@Override
	public PortfolioEntry updatePortfolioEntry(PortfolioEntryDto portfolioEntryDtoUpdated, Long id) {
		Optional<PortfolioEntry> portfolioEntry = repository.findById(id);

		if(!portfolioEntry.isPresent()){
			throw new EntityNotFoundException(id, PortfolioEntry.class);
		} else {
			portfolioEntryDtoUpdated.setId(id);
			return repository.save(portfolioEntryDtoUpdated.toPortfolioEntry());
		}
	}

	@Override
	public void deletePortfolioEntry(Long id) {
		repository.deleteById(id);
	}
}
