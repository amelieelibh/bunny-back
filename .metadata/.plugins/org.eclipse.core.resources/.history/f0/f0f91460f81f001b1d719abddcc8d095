package com.bunnystudio.users.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	
	@Positive(message = "id must be a positive long")
	private long id;
	
	@NotNull(message = "name cannot be null")
	@NotEmpty(message = "name cannot be empty")
	@Pattern(regexp = "[a-zA-ZÀ-ú]+(\\s[a-zA-ZÀ-ú]+)*", message = "Please enter a valid name")
	private String name;
}
