package com.example.vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitbtn = findViewById(R.id.Submitbtn),
               mrchipsbtn = findViewById(R.id.mrchips),
               novabtn = findViewById(R.id.nova),
               piattosbtn = findViewById(R.id.piattos),
               vcutbtn = findViewById(R.id.vcut);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inputText = findViewById(R.id.editTextNumber);
                String text = inputText.getText().toString();
                String inputAmount = text;
                int convertedAmount = Integer.valueOf(inputAmount);
                if (convertedAmount >=18) {
                    //Mr Chips
                    TextView mrchipstxt = findViewById(R.id.textMrChips);
                    mrchipstxt.setTextColor(Color.parseColor("#00FF00"));
                    mrchipsbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Perform action when the Button is clicked
                        }
                    });
                } else {
                    TextView coke = findViewById(R.id.textMrChips);
                    coke.setTextColor(Color.parseColor("#FF0000"));
                }
                if (convertedAmount >=20) {
                    //Nova
                    TextView novatxt = findViewById(R.id.textNova);
                    novatxt.setTextColor(Color.parseColor("#00FF00"));
                    novabtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Perform action when the Button is clicked
                        }
                    });
                } else {
                    TextView novatxt = findViewById(R.id.textNova);
                    novatxt.setTextColor(Color.parseColor("#FF0000"));
                }
                if (convertedAmount >=25) {
                    //Piattos
                    TextView piattostxt = findViewById(R.id.textPiattos);
                    piattostxt.setTextColor(Color.parseColor("#00FF00"));
                    piattosbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Perform action when the Button is clicked
                        }
                    });
                } else {
                    TextView piattostxt = findViewById(R.id.textPiattos);
                    piattostxt.setTextColor(Color.parseColor("#FF0000"));
                }
                if (convertedAmount >=30) {
                    //Vcut
                    TextView vcuttxt = findViewById(R.id.textVcut);
                    vcuttxt.setTextColor(Color.parseColor("#00FF00"));
                    vcutbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Perform action when the Button is clicked
                        }
                    });
                } else {
                    TextView vcuttxt = findViewById(R.id.textVcut);
                    vcuttxt.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

    }
}