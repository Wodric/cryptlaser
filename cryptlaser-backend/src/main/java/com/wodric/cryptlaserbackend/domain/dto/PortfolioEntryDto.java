package com.wodric.cryptlaserbackend.domain.dto;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.PortfolioEntry;
import com.wodric.cryptlaserbackend.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
public class PortfolioEntryDto {

	private long id;
	private CurrencyDto currencyDto;
	private BigDecimal amount;
	private PortfolioDto portfolioDto;

	public PortfolioEntry toPortfolioEntry(){
		PortfolioEntry portfolioEntry = new PortfolioEntry();
		portfolioEntry.setId(id);
		portfolioEntry.setCurrency(currencyDto.toCurrency());
		portfolioEntry.setAmount(amount);
		portfolioEntry.setPortfolio(portfolioDto.toPortfolio());
		return portfolioEntry;
	}
}


