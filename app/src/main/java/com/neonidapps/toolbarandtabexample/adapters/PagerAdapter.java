package com.neonidapps.toolbarandtabexample.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.neonidapps.toolbarandtabexample.fragments.FirstFragment;
import com.neonidapps.toolbarandtabexample.fragments.SecondFragment;
import com.neonidapps.toolbarandtabexample.fragments.ThirdFragment;


public class PagerAdapter extends FragmentStatePagerAdapter{

    private int numTabs;

    public PagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs=numTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new FirstFragment();
            case 1:return new SecondFragment();
            case 2: return new ThirdFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return this.numTabs;
    }
}
