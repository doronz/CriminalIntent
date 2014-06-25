package com.learning.criminalintent;

import java.util.UUID;

public class Crime {
	private UUID mId;
	private String mTitle;

	public Crime() {
		// Generate unique id
		mId = UUID.randomUUID();
	}

}

