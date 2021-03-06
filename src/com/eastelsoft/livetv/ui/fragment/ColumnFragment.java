package com.eastelsoft.livetv.ui.fragment;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eastelsoft.livetv.R;
import com.eastelsoft.livetv.ui.base.BaseFragment;

public class ColumnFragment extends BaseFragment{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
		System.out.println("ColumnFragment");
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.column_fragment, container, false);
		return view;
	}
	
	@Override
	public void onResume() {
		super.onResume();
	}
	
	public void buildActionBar() {
		ActionBar actionBar = getActivity().getActionBar();
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.setTitle(getString(R.string.bar_column_tile));
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
	}
}
