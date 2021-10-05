package com.example.carteiraeducada.ui.months.expenditure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.carteiraeducada.R;
import com.example.carteiraeducada.databinding.FragmentMonthsBinding;

public class ExpenditureFragment extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_expenditure, container, false);
        }

}