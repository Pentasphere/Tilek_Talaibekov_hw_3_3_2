package com.geeks.tilek_talaibekov_hw_3_3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkViewHolder> {

    private ArrayList<String> drinkList;

    public DrinkAdapter(ArrayList<String> drinkList) {
        this.drinkList = drinkList;
    }

    @NonNull
    @Override
    public DrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DrinkViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_drink, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkViewHolder holder, int position) {
        holder.inBind(drinkList.get(position));
    }

    @Override
    public int getItemCount() {
        return drinkList.size();
    }
}
