package com.wodric.cryptlaserbackend.api;

import com.wodric.cryptlaserbackend.exception.ApiCallsException;
import me.joshmcfarlin.cryptocompareapi.CryptoCompareAPI;
import me.joshmcfarlin.cryptocompareapi.Exceptions.InvalidParameterException;
import me.joshmcfarlin.cryptocompareapi.Exceptions.OutOfCallsException;
import me.joshmcfarlin.cryptocompareapi.models.coin.CoinList;
import me.joshmcfarlin.cryptocompareapi.models.market.ExchangeAverage;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CryptoCompareApiServiceImpl implements CryptoCompareApiService {

	private static CryptoCompareAPI api = new CryptoCompareAPI();

	@Override
	public ExchangeAverage getExchangeRate(String fromCurrencySymbol, String toCurrencySymbol){
		try {
			return api.market.getExchangeAverage(fromCurrencySymbol,fromCurrencySymbol);
		} catch (IOException | OutOfCallsException | InvalidParameterException e) {
			throw new ApiCallsException(e);
		}
	}

	@Override
	public CoinList getCoinList(){
		try {
			return api.coins.getCoinList();
		}  catch (IOException | OutOfCallsException e) {
			throw new ApiCallsException(e);
		}
	}
}
