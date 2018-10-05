package com.wodric.cryptlaserbackend.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.dto.CurrencyDto;
import com.wodric.cryptlaserbackend.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/currencies")
public class CurrencyController {

	@Autowired
	private CurrencyService currencyService;


	@GetMapping()
	public Collection<Currency> getAllCurrencies(){
		return 	currencyService.findAllCurrencies();
	}

	/*
	 * CRUD
	 */

	@PostMapping()
	public Currency createCurrency(@RequestBody CurrencyDto currency) {
		return currencyService.createCurrency(currency);
	}

	@GetMapping("/{id}")
	public Currency retrieveCurrency(@PathVariable Long id) {
		return currencyService.retrieveCurrency(id);
	}

	@PutMapping("/{id}")
	public Currency updateCurrency(@RequestBody CurrencyDto currency, @PathVariable Long id) {
		return currencyService.updateCurrency(currency, id);
	}

	@DeleteMapping("/{id}")
	public void deleteCurrency(@PathVariable long id) {
		currencyService.deleteCurrency(id);
	}
}
