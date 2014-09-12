package com.cricketer.hari.cricketers;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by hariprasath on 12/9/14.
 */
@TargetApi(11)
public class Dhoni extends FragmentActivity implements ActionBar.TabListener{
    ActionBar actionBar;
    ViewPager viewpager;
    FragmentPageAdapter ft;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.dhoni);
        actionBar=getActionBar();
        viewpager = (ViewPager)findViewById(R.id.pager);
        ft= new FragmentPageAdapter(getSupportFragmentManager());
        viewpager.setAdapter(ft);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("BIODATA").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("STATS").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("WIN %").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("RECORDS").setTabListener(this));
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {

            }

            @Override
            public void onPageSelected(int i) {
               actionBar.setSelectedNavigationItem(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
    @Override
    public void onTabUnselected(ActionBar.Tab t, FragmentTransaction ft) {
        // pass
    }
    @Override
    public void onTabSelected(ActionBar.Tab t, FragmentTransaction ft) {
        // pass
        viewpager.setCurrentItem(t.getPosition());
    }
    @Override
    public void onTabReselected(ActionBar.Tab t, FragmentTransaction ft) {
        // pass
    }
}