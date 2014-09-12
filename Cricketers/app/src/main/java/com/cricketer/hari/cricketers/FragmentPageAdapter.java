package com.cricketer.hari.cricketers;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hariprasath on 12/9/14.
 */
public class FragmentPageAdapter extends FragmentPagerAdapter {

    public FragmentPageAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                    return new dhoni_biodata();
            case 1:
                    return new dhoni_stats();
            case 2:
                    return new dhoni_win_per();
            case 3:
                    return new dhoni_records();
            default:
                    break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
