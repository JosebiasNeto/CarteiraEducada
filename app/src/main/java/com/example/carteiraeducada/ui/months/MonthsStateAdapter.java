package com.example.carteiraeducada.ui.months;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import java.util.ArrayList;

public class MonthsStateAdapter
        extends FragmentPagerAdapter {

    private final ArrayList<Fragment> fragments = new ArrayList<>();
    private final ArrayList<String> fragmentsTitle = new ArrayList<>();

    public MonthsStateAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public void addFragment(Fragment fragment, String title){
        fragments.add(fragment);
        fragmentsTitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentsTitle.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
