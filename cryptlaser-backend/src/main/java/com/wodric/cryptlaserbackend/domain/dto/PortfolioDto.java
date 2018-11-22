package com.wodric.cryptlaserbackend.domain.dto;

import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.PortfolioEntry;
import com.wodric.cryptlaserbackend.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class PortfolioDto {

	private long id;
	private User user;
	private String name;
	private List<PortfolioEntryDto> portfolioEntryDtoList;

	public Portfolio toPortfolio(){
		Portfolio portfolio = new Portfolio();
		portfolio.setId(id);
		portfolio.setUser(user);
		portfolio.setName(name);
		portfolio.setEntryList(portfolioEntryDtoList.stream()
				.map(PortfolioEntryDto::toPortfolioEntry)
				.collect(Collectors.toList()));
		return portfolio;
	}
}


