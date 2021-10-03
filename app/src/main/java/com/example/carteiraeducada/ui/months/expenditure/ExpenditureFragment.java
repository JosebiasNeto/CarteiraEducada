package com.example.carteiraeducada.ui.months.expenditure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.carteiraeducada.databinding.FragmentMonthsBinding;

public class ExpenditureFragment extends Fragment {

    private ExpenditureViewModel expenditureViewModel;
    private FragmentMonthsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        expenditureViewModel =
                new ViewModelProvider(this).get(ExpenditureViewModel.class);

        binding = FragmentMonthsBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}