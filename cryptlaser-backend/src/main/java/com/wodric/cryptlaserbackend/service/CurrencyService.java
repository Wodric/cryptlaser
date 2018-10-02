package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Currency;

import java.util.Collection;

public interface CurrencyService {

	Collection<Currency> findAllCurrencies();

	long countCurrencies();

	Currency createCurrency(Currency currencyDto);

	Currency retrieveCurrency(Long id);

	Currency updateCurrency(Currency currencyDto, Long id);

	void deleteCurrency(Long id);
}
