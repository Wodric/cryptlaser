package com.wodric.cryptlaserbackend.domain.dto;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.CurrencyValue;
import com.wodric.cryptlaserbackend.domain.CurrencyType;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CurrencyDto {
	private long id;
	private String shortName;
	private String name;
	private long numberOnMarket;
	private CurrencyType type;
	private String webSite;
	private List<CurrencyValue> lastValueList;

	public Currency toCurrency(){
		Currency currency = new Currency();
		currency.setId(id);
		currency.setShortName(shortName);
		currency.setName(name);
		currency.setType(type);
		currency.setNumberOnMarket(numberOnMarket);
		currency.setWebsite(webSite);
		currency.setLastValueList(lastValueList);

		return currency;
	}
}
