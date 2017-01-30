package com.sandyz.tabswithfragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by santosh on 28-01-2017.
 */

public class PagerAdapterTabs extends FragmentStatePagerAdapter {

    final int PAGE_COUNT = 2;
    private String tabtitles[]=new String[]{"video","Audio"};
    private Context context;


    public PagerAdapterTabs(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return Video_Fragment.newInstance(position+1);

            case 1: // Fragment # 0 - This will show FirstFragment different title

            return Audio_Fragment.newInstance(position+2);

            default:
                return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles[position];
    }
}
