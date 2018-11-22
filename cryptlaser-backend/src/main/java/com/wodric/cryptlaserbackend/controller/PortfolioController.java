package com.wodric.cryptlaserbackend.controller;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.Portfolio;
import com.wodric.cryptlaserbackend.domain.PortfolioEntry;
import com.wodric.cryptlaserbackend.domain.dto.CurrencyDto;
import com.wodric.cryptlaserbackend.domain.dto.PortfolioDto;
import com.wodric.cryptlaserbackend.domain.dto.PortfolioEntryDto;
import com.wodric.cryptlaserbackend.service.CurrencyService;
import com.wodric.cryptlaserbackend.service.PortfolioEntryService;
import com.wodric.cryptlaserbackend.service.PortfolioService;
import com.wodric.cryptlaserbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/porfolios")
public class PortfolioController {

	@Autowired
	private PortfolioService portfolioService;

	@Autowired
	private PortfolioEntryService portfolioEntryService;

	@GetMapping()
	public List<Portfolio> getUserPortfolio(@PathVariable long userId){
		return 	portfolioService.findAllPortfoliosForUser(userId);
	}

	/*
	 * CRUD
	 */

	@PostMapping()
	public Portfolio createPortfolio(@RequestBody PortfolioDto portfolioDto) {
		return portfolioService.createPortfolio(portfolioDto);
	}

	@GetMapping("/{portfolioId}")
	public Portfolio retrievePortfolio(@PathVariable Long portfolioId) {
		return portfolioService.retrievePortfolio(portfolioId);
	}

	@PutMapping("/{portfolioId}")
	public Portfolio updatePortfolio(@RequestBody PortfolioDto portfolioDto, @PathVariable Long portfolioId) {
		return portfolioService.updatePortfolio(portfolioDto, portfolioId);
	}

	@DeleteMapping("/{portfolioId}")
	public void deletePortfolio(@PathVariable long portfolioId) {
		portfolioService.deletePortfolio(portfolioId);
	}

	/*
	 * entries entry point
	 */

	@GetMapping("/{portfolioId}/entries")
	public List<PortfolioEntry> getPortfolioEntries(@PathVariable long portfolioId){
		return 	portfolioEntryService.findEntryForPortfolioId(portfolioId);
	}

	@PostMapping("/{portfolioId}/entries")
	public PortfolioEntry createPortfolio(@PathVariable long portfolioId, @RequestBody PortfolioEntryDto portfolioEntryDto) {
		return portfolioEntryService.createPortfolioEntry(portfolioEntryDto);
	}

	@GetMapping("/{portfolioId}/entries/{portfolioEntryId}")
	public PortfolioEntry retrievePortfolio(@PathVariable Long portfolioId, @PathVariable long portfolioEntryId) {
		return portfolioEntryService.retrievePortfolioEntry(portfolioEntryId);
	}

	@PutMapping("/{portfolioId}/entries/{portfolioEntryId}")
	public PortfolioEntry updatePortfolio(@RequestBody PortfolioEntryDto portfolioEntryDto,
										  @PathVariable Long portfolioId , @PathVariable long portfolioEntryId) {
		return portfolioEntryService.updatePortfolioEntry(portfolioEntryDto, portfolioEntryId);
	}

	@DeleteMapping("/{portfolioId}/entries/{portfolioEntryId}")
	public void deletePortfolio(@PathVariable Long portfolioId, @PathVariable long portfolioEntryId) {
		portfolioEntryService.deletePortfolioEntry(portfolioEntryId);
	}

}
