package com.example.carteiraeducada.ui.months;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentViewHolder;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.carteiraeducada.R;
import com.example.carteiraeducada.databinding.FragmentMonthsBinding;
import com.example.carteiraeducada.ui.months.balance.BalanceFragment;
import com.example.carteiraeducada.ui.months.expenditure.ExpenditureFragment;
import com.example.carteiraeducada.ui.months.expenditure.ExpenditureViewModel;
import com.example.carteiraeducada.ui.months.income.IncomeFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MonthsFragment extends Fragment {

    ViewPager vpMonths;
    TabLayout tabLayout;
    private FragmentMonthsBinding binding;
    private ExpenditureViewModel expenditureViewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMonthsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        expenditureViewModel = new ViewModelProvider(getActivity())
                .get(ExpenditureViewModel.class);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        tabLayout = view.findViewById(R.id.tabs);
        vpMonths = view.findViewById(R.id.vp_months);

        tabLayout.setupWithViewPager(vpMonths);
        MonthsStateAdapter monthsStateAdapter = new MonthsStateAdapter(getFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        monthsStateAdapter.addFragment(new ExpenditureFragment(), "Expenditure");
        monthsStateAdapter.addFragment(new IncomeFragment(), "Income");
        monthsStateAdapter.addFragment(new BalanceFragment(), "Balance");

        vpMonths.setAdapter(monthsStateAdapter);
    }
}