package com.wodric.cryptlaserbackend.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "PortfolioEntries")
public class PortfolioEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@NotNull
	private Currency currency;

	@NotNull
	private BigDecimal amount;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "portfolioId")
	private  Portfolio portfolio;

	@Version
	private Long version;
}
