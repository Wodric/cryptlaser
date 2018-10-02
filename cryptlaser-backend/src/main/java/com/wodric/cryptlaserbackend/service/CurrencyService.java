package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.dto.CurrencyDto;

import java.util.Collection;

public interface CurrencyService {

	Collection<Currency> findAllCurrencies();

	long countCurrencies();

	Currency createCurrency(CurrencyDto currencyDto);

	Currency retrieveCurrency(Long id);

	Currency updateCurrency(CurrencyDto currencyDto, Long id);

	void deleteCurrency(Long id);
}
