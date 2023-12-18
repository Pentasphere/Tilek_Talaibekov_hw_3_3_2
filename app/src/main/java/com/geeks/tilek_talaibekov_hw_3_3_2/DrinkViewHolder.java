package com.geeks.tilek_talaibekov_hw_3_3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DrinkViewHolder extends RecyclerView.ViewHolder {

    private TextView tvDrink;
    public DrinkViewHolder(@NonNull View itemView) {
        super(itemView);
        tvDrink = itemView.findViewById(R.id.tv_drink);
    }
    public void inBind(String drink){
        tvDrink.setText(drink);
    }
}
