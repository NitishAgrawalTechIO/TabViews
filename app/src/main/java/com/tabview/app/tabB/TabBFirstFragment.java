package com.tabview.app.tabB;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.tabview.app.R;
import com.tabview.app.base.BaseFragment;
import com.tabview.app.base.Constants;

public class TabBFirstFragment extends BaseFragment {

    private Button mGotoButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view       =   inflater.inflate(R.layout.app_tab_b_first_screen, container, false);

        mGotoButton =   (Button) view.findViewById(R.id.id_next_tab_b_button);
        mGotoButton.setOnClickListener(listener);

        return view;
    }

    private OnClickListener listener        =   new OnClickListener(){
        @Override
        public void onClick(View v){
            /* Go to next fragment in navigation stack*/
            mActivity.pushFragments(Constants.TAB_B, new TabBSecondFragment(),true,true);
        }
    };
}
