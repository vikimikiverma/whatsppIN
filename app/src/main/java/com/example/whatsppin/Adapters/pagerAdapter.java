package com.example.whatsppin.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.whatsppin.fragments.callFragment;
import com.example.whatsppin.fragments.chatfragment;
import com.example.whatsppin.fragments.statusfragment;

public class pagerAdapter extends FragmentStatePagerAdapter {

    int tabcount;

    public pagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new chatfragment();

            case 1:
                return new statusfragment();

            case 2:

                return new callFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
