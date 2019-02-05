package com.tabview.app.tabA;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tabview.app.R;
import com.tabview.app.base.BaseFragment;


public class TabAThirdFragment extends BaseFragment {

	private Button mGotoButton;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
        View view       =   inflater.inflate(R.layout.app_tab_a_third_screen, container, false);
        return view;
	}
}
