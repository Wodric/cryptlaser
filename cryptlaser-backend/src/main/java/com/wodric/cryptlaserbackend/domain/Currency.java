package com.wodric.cryptlaserbackend.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min=3, max=3)
    private String shortName;

    @NotNull
    @Size(min = 3, max = 30)
    private String name;

    @Min(value = 0)
    private long numberOnMarket;

    @Enumerated(EnumType.STRING)
    private CurrencyType type;
}
