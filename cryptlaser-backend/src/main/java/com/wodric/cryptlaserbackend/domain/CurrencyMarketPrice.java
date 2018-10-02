package com.wodric.cryptlaserbackend.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class CurrencyMarketPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    @ManyToOne
    Currency currency;

    @NotNull
    @ManyToOne
    Currency referenceCurrency;

    @NotNull
    @Min(value = 0)
    BigDecimal rate;

    @NotNull
    Date date;
}
