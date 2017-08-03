package com.bignerdranch.android.link;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by CY on 2017. 8. 3..
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragmentLinks tabFragmentLinks = new TabFragmentLinks();
                return tabFragmentLinks;
            case 1:
                TabFragmentPlaylists tabFragmentPlaylists = new TabFragmentPlaylists();
                return tabFragmentPlaylists;
            case 2:
                TabFragmentFollowing tabFragmentFollowing = new TabFragmentFollowing();
                return tabFragmentFollowing;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
