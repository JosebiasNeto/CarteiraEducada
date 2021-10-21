package com.example.carteiraeducada.ui.months.expenditure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carteiraeducada.R;
import com.example.carteiraeducada.databinding.FragmentExpenditureBinding;
import com.example.carteiraeducada.databinding.FragmentMonthsBinding;
import com.example.carteiraeducada.ui.CreateFinCard;
import com.example.carteiraeducada.ui.months.FinCardAdapter;
import com.example.carteiraeducada.ui.months.MonthsFragment;

import java.util.ArrayList;

public class ExpenditureFragment extends Fragment {

    private ExpenditureViewModel expenditureViewModel;
    private FragmentExpenditureBinding binding;
    private FinCardAdapter adapter;


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            expenditureViewModel = new ViewModelProvider(getActivity())
                    .get(ExpenditureViewModel.class);
            binding = FragmentExpenditureBinding.inflate(inflater, container, false);
            View root = binding.getRoot();
            RecyclerView recyclerView = binding.rvExpenses;
//            adapter = new FinCardAdapter(
//                expenditureViewModel.getFinCards().getValue()
//            );
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

            binding.btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showDialog();
                }
            });

            return root;
        }

        private void showDialog(){
            FragmentManager fm = getFragmentManager();
            CreateFinCard createFinCard = new CreateFinCard();
            createFinCard.show(fm, "Dialog");
        }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}