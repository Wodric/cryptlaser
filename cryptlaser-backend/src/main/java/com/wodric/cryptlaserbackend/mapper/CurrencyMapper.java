package com.wodric.cryptlaserbackend.mapper;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.CurrencyType;
import me.joshmcfarlin.cryptocompareapi.models.coin.CoinEntry;

public class CurrencyMapper {

	public static Currency fromCoinEntry(CoinEntry coinEntry){
		Currency currency = new Currency();
		currency.setName(coinEntry.getCoinName());
		currency.setShortName(coinEntry.getName());
		currency.setType(CurrencyType.CRYPTO);
		return currency;
	}
}
