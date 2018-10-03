package com.wodric.cryptlaserbackend.repository;

import com.wodric.cryptlaserbackend.domain.CurrencyMarketPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyMarketPriceRepository extends JpaRepository<CurrencyMarketPrice, Long> {
}
