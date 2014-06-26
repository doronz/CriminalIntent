package com.learning.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
	private UUID mId;
	private String mTitle;
	private Date mDate; // The date a crime occurred.
	private boolean mSolved; // Was the crime solved?


	public Crime() {
		// Generate unique id
		mId = UUID.randomUUID();
		mDate = new Date();
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public UUID getmId() {
		return mId;
	}

}

