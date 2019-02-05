package com.tabview.app.tabA;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.tabview.app.R;
import com.tabview.app.base.BaseFragment;
import com.tabview.app.base.Constants;

public class TabAFirstFragment extends BaseFragment {
    private Button mGotoButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view       =   inflater.inflate(R.layout.app_tab_a_first_screen, container, false);

        mGotoButton =   (Button) view.findViewById(R.id.id_next_tab_a_button);
        mGotoButton.setOnClickListener(listener);

        return view;
    }

    private OnClickListener listener        =   new OnClickListener(){
        @Override
        public void onClick(View v){
            /* Go to next fragment in navigation stack*/
            mActivity.pushFragments(Constants.TAB_A, new TabASecondFragment(),true,true);
        }
    };
}
