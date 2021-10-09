package com.example.carteiraeducada.ui.months;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carteiraeducada.R;
import com.example.carteiraeducada.domain.model.FinCard;

import java.util.ArrayList;
import java.util.List;

public class FinCardAdapter extends RecyclerView.Adapter<FinCardAdapter.FinCardViewHolder> {

    private List<FinCard> localExpenses;

    public static class FinCardViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView value;
        private final TextView date;
        private final CheckBox executed;

        public TextView getName() {
            return name;
        }

        public TextView getValue() {
            return value;
        }

        public TextView getDate() {
            return date;
        }

        public CheckBox getExecuted() {
            return executed;
        }

        public FinCardViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tv_fincard_name);
            value = itemView.findViewById(R.id.tv_fincard_value);
            date = itemView.findViewById(R.id.tv_fincard_date);
            executed = itemView.findViewById(R.id.checkbox);
        }

    }

    public FinCardAdapter(List<FinCard> expenses){
        localExpenses = expenses;
    }

    @NonNull
    @Override
    public FinCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fincard_item, parent, false);
        return new FinCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FinCardViewHolder holder, int position) {
        holder.getName().setText(localExpenses.get(position).getName());
        holder.getDate().setText(localExpenses.get(position).getDate());
        holder.getValue().setText(String.valueOf(localExpenses.get(position).getValue()));
        holder.getExecuted().setSelected(localExpenses.get(position).isExecuted());
    }


    @Override
    public int getItemCount() {
        return localExpenses.size();
    }


}
