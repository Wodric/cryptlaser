package com.wodric.cryptlaserbackend.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "AppUsers")
public class User {

	@Id
	@GeneratedValue()
	private long id;

	@Pattern(regexp  = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	@NotNull
	private String email;

	@NotNull
	private String password;

	@OneToMany(mappedBy = "AppUsers")
	private List<Portfolio> portfolio;

	@Version
	private Long version;
}
