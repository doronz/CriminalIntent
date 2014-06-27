package com.learning.criminalintent;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

public class CrimeListFragment extends ListFragment {
	private ArrayList<Crime> mCrimes;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.string.crimes_title);

		mCrimes = CrimeLab.get(getActivity()).getCrimes(); // Get hosting
															// activity, then
															// get it's crimes
															// and save them in
															// mCrimes.
	}
}
