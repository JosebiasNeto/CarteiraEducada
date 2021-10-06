package com.example.carteiraeducada.ui.months.expenditure;

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

public class ExpenditureAdapter extends RecyclerView.Adapter<ExpenditureAdapter.ExpenditureViewHolder> {

    private ArrayList<FinCard> localExpenses;

    public static class ExpenditureViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView value;
        private final TextView date;
        private final CheckBox executed;

        public ExpenditureViewHolder(@NonNull View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.tv_fincard_name);
            value = (TextView) itemView.findViewById(R.id.tv_fincard_value);
            date = (TextView) itemView.findViewById(R.id.tv_fincard_date);
            executed = (CheckBox) itemView.findViewById(R.id.checkbox);
        }

        public FinCard getFinCard(){
            FinCard fincard = new FinCard();
            fincard.setName(name.toString());
            fincard.setDate(date.toString());
            fincard.setExecuted(executed.isChecked());
            return fincard;
        }

    }

    public ExpenditureAdapter(ArrayList<FinCard> expenses){
        localExpenses = expenses;
    }

    @NonNull
    @Override
    public ExpenditureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fincard_item, parent, false);
        return new ExpenditureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExpenditureViewHolder holder, int position) {
        holder.getFinCard().setName(localExpenses.get(position).getName());
        holder.getFinCard().setDate(localExpenses.get(position).getDate());
        holder.getFinCard().setValue(localExpenses.get(position).getValue());
        holder.getFinCard().setExecuted(localExpenses.get(position).getExecuted());
    }


    @Override
    public int getItemCount() {
        return localExpenses.size();
    }


}
