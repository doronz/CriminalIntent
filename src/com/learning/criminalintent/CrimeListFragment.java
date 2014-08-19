package com.learning.criminalintent;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CrimeListFragment extends ListFragment {
	private ArrayList<Crime> mCrimes;
	private static final String TAG = CrimeListFragment.class.getSimpleName();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.string.crimes_title);

		mCrimes = CrimeLab.get(getActivity()).getCrimes(); // Get hosting
															// activity, then
															// get it's crimes
															// and save them in
															// mCrimes.
		CrimeAdapter adapter = new CrimeAdapter(mCrimes);
		setListAdapter(adapter);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Crime c = ((CrimeAdapter) getListAdapter()).getItem(position);
		Toast.makeText(getActivity(), c.getTitle() + " was clicked!",
				Toast.LENGTH_SHORT).show();
	}

	private class CrimeAdapter extends ArrayAdapter<Crime> {
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// If we weren't given a view, inflate one
			if (convertView == null) {
				convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_crime, null);
			}
			
			// Configure the view for this crime
			Crime c = getItem(position);
			
			TextView titleTextView = (TextView)convertView.findViewById(R.id.crime_list_item_titleTextView);
			titleTextView.setText(c.getTitle());
			
			TextView dateTextView = (TextView)convertView.findViewById(R.id.crime_list_item_dateTextView);
			dateTextView.setText(c.getDate().toString());
			
			CheckBox solvedCheckBox = (CheckBox)convertView.findViewById(R.id.crime_list_item_solvedCheckBox);
			solvedCheckBox.setChecked(c.isSolved());
			
			return convertView;
		}

		public CrimeAdapter(ArrayList<Crime> crimes) {
			super(getActivity(), 0, crimes);
		}
	}
}
