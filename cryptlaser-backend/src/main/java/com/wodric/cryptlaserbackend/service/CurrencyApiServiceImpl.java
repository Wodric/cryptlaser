package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.api.CryptoCompareApiService;
import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.mapper.CurrencyMapper;
import me.joshmcfarlin.cryptocompareapi.Exceptions.InvalidParameterException;
import me.joshmcfarlin.cryptocompareapi.Exceptions.OutOfCallsException;
import me.joshmcfarlin.cryptocompareapi.models.coin.CoinList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CurrencyApiServiceImpl implements CurrencyApiService {

	@Autowired
	private CryptoCompareApiService cryptoCompareApiService;

	public List<Currency> getCoinList(){
			CoinList coinList = cryptoCompareApiService.getCoinList();
			return coinList.getCoins().values().stream()
					.map(CurrencyMapper::fromCoinEntry)
					.collect(Collectors.toList());
	}
}
