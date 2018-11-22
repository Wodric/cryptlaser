package com.wodric.cryptlaserbackend.repository;

import com.wodric.cryptlaserbackend.domain.CurrencyValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyValueRepository extends JpaRepository<CurrencyValue, Long> {
}
