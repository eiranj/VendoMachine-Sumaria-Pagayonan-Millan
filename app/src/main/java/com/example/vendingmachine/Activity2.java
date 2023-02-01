package com.example.vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView Price, Amount;
        Price = findViewById(R.id.Price);
        Amount = findViewById(R.id.Amount);

        String Pricestr = getIntent().getStringExtra("Amount");
        String Amountstr = getIntent().getStringExtra("Price");

        Price.setText(Pricestr);
        Amount.setText(Amountstr);


    }
}