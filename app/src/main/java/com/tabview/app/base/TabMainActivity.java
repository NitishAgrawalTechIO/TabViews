package com.tabview.app.base;

import java.util.HashMap;
import java.util.Stack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;

import com.tabview.app.R;
import com.tabview.app.tabA.TabAFirstFragment;
import com.tabview.app.tabB.TabBFirstFragment;
import com.tabview.app.tabC.TabCFirstFragment;


public class TabMainActivity extends AppCompatActivity {

    private TabMainFragment tabFragment;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);
        if (savedInstanceState == null) {
            tabFragment = new TabMainFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, tabFragment).commit();
        }
    }

    public void pushFragments(String tag, Fragment fragment,boolean shouldAnimate, boolean shouldAdd){
        tabFragment.pushFragments(tag, fragment, shouldAnimate, shouldAdd);
    }

    @Override
    public void onBackPressed() {
        if (tabFragment.onBackPressed()){
            super.onBackPressed();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       tabFragment.onActivityResult(requestCode, resultCode, data);
    }
}
