package com.example.carteiraeducada.ui.months.expenditure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.carteiraeducada.R;
import com.example.carteiraeducada.databinding.FragmentExpenditureBinding;
import com.example.carteiraeducada.databinding.FragmentMonthsBinding;
import com.example.carteiraeducada.ui.months.MonthsFragment;

public class ExpenditureFragment extends Fragment {

    private ExpenditureViewModel expenditureViewModel;
    private FragmentExpenditureBinding binding;


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            expenditureViewModel = new ViewModelProvider(getActivity())
                    .get(ExpenditureViewModel.class);
            binding = FragmentExpenditureBinding.inflate(inflater, container, false);
            View root = binding.getRoot();

            final TextView textView = binding.textHome;

            expenditureViewModel.getText().observe(
                    getViewLifecycleOwner(), new Observer<String>() {
                        @Override
                        public void onChanged(String s) {
                            binding.textHome.setText(s);
                        }
                    }
            );
            return root;
        }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}