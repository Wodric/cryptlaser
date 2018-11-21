package com.wodric.cryptlaserbackend.service;

import com.wodric.cryptlaserbackend.domain.Currency;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CurrencyApiService {
	List<Currency> getCoinList();
}
