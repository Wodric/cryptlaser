package com.wodric.cryptlaserbackend.domain.dto;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.CurrencyType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class CurrencyDto {
	private long id;
	private String shortName;
	private String name;
	private long numberOnMarket;
	private CurrencyType type;

	public Currency toCurrency(){
		Currency currency = new Currency();
		currency.setId(id);
		currency.setShortName(shortName);
		currency.setName(name);
		currency.setType(type);
		currency.setNumberOnMarket(numberOnMarket);

		return currency;
	}
}
