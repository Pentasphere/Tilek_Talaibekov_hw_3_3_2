package com.geeks.tilek_talaibekov_hw_3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvDrink;
    private ArrayList<String> drinkList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
        DrinkAdapter adapter = new DrinkAdapter(drinkList);
        rvDrink.setAdapter(adapter);
    }

    private void loadData() {
        drinkList.add("Cola");
        drinkList.add("Fanta");
        drinkList.add("Sprite");
        drinkList.add("Chai");
        drinkList.add("Capuchino");
        drinkList.add("Latte");
        drinkList.add("Expresso");
        drinkList.add("Pepsi");
        drinkList.add("Airan");
        drinkList.add("Kimiz");
    }

    private void initView() {
        rvDrink = findViewById(R.id.rv_drink);
    }
}