package com.wodric.cryptlaserbackend.api;

import me.joshmcfarlin.cryptocompareapi.Exceptions.InvalidParameterException;
import me.joshmcfarlin.cryptocompareapi.Exceptions.OutOfCallsException;
import me.joshmcfarlin.cryptocompareapi.models.coin.CoinList;
import me.joshmcfarlin.cryptocompareapi.models.market.ExchangeAverage;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface CryptoCompareApiService {

	ExchangeAverage getExchangeRate(String fromCurrencySymbol, String toCurrencySymbol);

	CoinList getCoinList();
}
