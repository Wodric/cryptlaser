package com.wodric.cryptlaserbackend;

import com.wodric.cryptlaserbackend.domain.Currency;
import com.wodric.cryptlaserbackend.domain.CurrencyType;
import com.wodric.cryptlaserbackend.repository.CurrencyRepository;
import javafx.util.Pair;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class CryptlaserBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptlaserBackendApplication.class, args);
	}

	@Bean
	ApplicationRunner init(CurrencyRepository repository) {
		return args -> {
			Currency dollar = new Currency();
			dollar.setName("Dollar");
			dollar.setShortName("USD");
			dollar.setType(CurrencyType.PHYSICAL);

			Currency bitcoin = new Currency();
			bitcoin.setName("Bitcoin");
			bitcoin.setShortName("BTC");
			bitcoin.setType(CurrencyType.CRYPTO);


			Currency ethereum = new Currency();
			ethereum.setName("Ethereum");
			ethereum.setShortName("ETH");
			ethereum.setType(CurrencyType.CRYPTO);

			Stream.of(dollar,bitcoin,ethereum)
					.forEach(repository::save);
			repository.findAll().forEach(System.out::println);
		};
	}
}
