package com.wodric.cryptlaserbackend;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.CurrencyMarketPrice;
import com.wodric.cryptlaserbackend.domain.CurrencyType;
import com.wodric.cryptlaserbackend.repository.CurrencyMarketPriceRepository;
import com.wodric.cryptlaserbackend.repository.CurrencyRepository;
import com.wodric.cryptlaserbackend.service.CurrencyApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class CryptlaserBackendApplication {

	@Autowired
	CurrencyApiService currencyApiService;

	public static void main(String[] args) {
		SpringApplication.run(CryptlaserBackendApplication.class, args);
	}

	@Bean
	ApplicationRunner init(CurrencyRepository repository, CurrencyMarketPriceRepository priceRepository) {
		return args -> {

			List<Currency> currencies = currencyApiService.getCoinList();

			Currency dollar = new Currency();
			dollar.setName("Dollar");
			dollar.setShortName("USD");
			dollar.setType(CurrencyType.PHYSICAL);
			currencies.add(dollar);


			currencies.forEach(repository::save);

			CurrencyMarketPrice bitcoinMarketPrice = new CurrencyMarketPrice();
			bitcoinMarketPrice.setReferenceCurrency(dollar);
			bitcoinMarketPrice.setDate(Date.from(Instant.now()));
			bitcoinMarketPrice.setId(1);
			bitcoinMarketPrice.setRate(BigDecimal.valueOf(6498.75D));
			priceRepository.save(bitcoinMarketPrice);


		};
	}
}
