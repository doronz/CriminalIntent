package com.learning.criminalintent;

import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;

public class CrimeLab {
	private ArrayList<Crime> mCrimes;
	private static CrimeLab sCrimeLab;
	private Context mAppContext;
	
	// Contructor of singleton
	private CrimeLab(Context appContext) {
		mAppContext = appContext;
		mCrimes = new ArrayList<Crime>();
		
		for (int i = 0; i < 100; i++) { // Create 100 arbitrary crimes
			Crime c = new Crime(); // Allocate crime
			c.setTitle("Crime #" + i); // Arbitrary crime title.
			c.setSolved(i % 2 == 0); // Every other crime is solved
			mCrimes.add(c); // Add this crime to the crimes list
		}
	}
	
	public static CrimeLab get(Context c) {
		if (sCrimeLab == null) {
			sCrimeLab = new CrimeLab(c.getApplicationContext());
		}
		return sCrimeLab;
	}
	
	public ArrayList<Crime> getCrimes() {
		return mCrimes;
	}
	
	public Crime getCrime(UUID id) {
		for (Crime c : mCrimes) {
			if (c.getId().equals(id))
				return c;
		}
		return null;
	}
	
}
