package com.wodric.cryptlaserbackend.controller;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.dto.CurrencyDto;
import com.wodric.cryptlaserbackend.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class CurrencyController {

	@Autowired
	private CurrencyService currencyService;


	@GetMapping("/currencies")
	public Collection<Currency> getAllCurrencies(){
		return 	currencyService.findAllCurrencies();
	}

	/*
	 * CRUD
	 */

	@PostMapping("/currencies")
	public Currency createCurrency(@RequestBody CurrencyDto currency) {
		return currencyService.createCurrency(currency);
	}

	@GetMapping("/currencies/{id}")
	public Currency retrieveCurrency(@PathVariable Long id) {
		return currencyService.retrieveCurrency(id);
	}

	@PutMapping("/currencies/{id}")
	public Currency updateCurrency(@RequestBody CurrencyDto currency, @PathVariable Long id) {
		return currencyService.updateCurrency(currency, id);
	}

	@DeleteMapping("/currencies/{id}")
	public void deleteCurrency(@PathVariable long id) {
		currencyService.deleteCurrency(id);
	}
}
