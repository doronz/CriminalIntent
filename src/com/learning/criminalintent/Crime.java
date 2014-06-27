package com.learning.criminalintent;

import java.util.Date;
import java.util.UUID;

import android.text.format.DateFormat;

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

	public Date getDate() {
		return mDate;
	}

	public void setDate(Date mDate) {
		this.mDate = mDate;
	}

	public boolean isSolved() {
		return mSolved;
	}

	public void setSolved(boolean mSolved) {
		this.mSolved = mSolved;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public UUID getId() {
		return mId;
	}

}

