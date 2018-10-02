package com.wodric.cryptlaserbackend.repository;

import com.wodric.cryptlaserbackend.domain.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

}
