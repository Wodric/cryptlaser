package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.exception.CurrencyNotFoundException;
import com.wodric.cryptlaserbackend.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class CurrencyServiceImpl implements CurrencyService {

	@Autowired
	private CurrencyRepository currencyRepository;


	@Override
	public Collection<Currency> findAllCurrencies() {
		return currencyRepository.findAll();
	}

	@Override
	public long countCurrencies() {
		return currencyRepository.count();
	}

	@Override
	public Currency createCurrency(Currency currency) {
		return currencyRepository.save(currency);
	}

	@Override
	public Currency retrieveCurrency(Long id) {
		Optional<Currency> currency = currencyRepository.findById(id);

		if(!currency.isPresent()){
			throw new CurrencyNotFoundException(id);
		} else {
			return currency.get();
		}
	}

	@Override
	public Currency updateCurrency(Currency currencyUpdated, Long id) {
		Optional<Currency> currency = currencyRepository.findById(id);

		if(!currency.isPresent()){
			throw new CurrencyNotFoundException(id);
		} else {
			currencyUpdated.setId(id);
			return currencyRepository.save(currencyUpdated);
		}
	}

	@Override
	public void deleteCurrency(Long id) {
		currencyRepository.deleteById(id);
	}
}
