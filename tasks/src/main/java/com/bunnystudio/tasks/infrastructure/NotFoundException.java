package com.bunnystudio.tasks.infrastructure;

import java.util.concurrent.CompletionException;

public class NotFoundException extends CompletionException {

	private static final long serialVersionUID = 3836677757188033028L;

	public NotFoundException(String message) {
		super(message);
	}
	public NotFoundException(long message) {
		this("" + message);
	}

}
