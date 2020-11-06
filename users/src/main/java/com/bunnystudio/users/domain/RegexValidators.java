package com.bunnystudio.users.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RegexValidators {
	public static final String REGEX_NAME = "[a-zA-ZÀ-ú]+(\\s[a-zA-ZÀ-ú]+)*";
}
