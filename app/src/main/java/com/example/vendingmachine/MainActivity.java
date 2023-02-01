package com.example.vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
                    String mrchipsstr = mrchipstxt.getText().toString();

                    int change = convertedAmount - 18;
                    String changestr = String.valueOf(change);

                    mrchipstxt.setTextColor(Color.parseColor("#00FF00"));
                    mrchipsbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Perform action when the Button is clicked
                            Intent jumppage = new Intent(MainActivity.this, Activity2.class);
                            jumppage.putExtra("Amount", inputAmount);
                            jumppage.putExtra("Price", mrchipsstr);
                            jumppage.putExtra("image",R.drawable.mrchips);
                            jumppage.putExtra("change", changestr);
                            startActivity(jumppage);

                        }
                    });
                } else {
                    TextView mrchipstxt = findViewById(R.id.textMrChips);
                    mrchipstxt.setTextColor(Color.parseColor("#FF0000"));
                }
                if (convertedAmount >=20) {
                    //Nova
                    TextView novatxt = findViewById(R.id.textNova);
                    String novastr = novatxt.getText().toString();

                    int change = convertedAmount - 20;
                    String changestr = String.valueOf(change);

                    novatxt.setTextColor(Color.parseColor("#00FF00"));
                    novabtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent jumppage = new Intent(MainActivity.this, Activity2.class);

                            jumppage.putExtra("Amount", inputAmount);
                            jumppage.putExtra("Price", novastr);
                            jumppage.putExtra("image",R.drawable.nova);
                            jumppage.putExtra("change", changestr);
                            startActivity(jumppage);
                        }
                    });
                } else {
                    TextView novatxt = findViewById(R.id.textNova);
                    novatxt.setTextColor(Color.parseColor("#FF0000"));
                }
                if (convertedAmount >=25) {
                    //Piattos
                    TextView piattostxt = findViewById(R.id.textPiattos);
                    String piattosstr = piattostxt.getText().toString();

                    int change = convertedAmount - 25;
                    String changestr = String.valueOf(change);

                    piattostxt.setTextColor(Color.parseColor("#00FF00"));
                    piattosbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent jumppage = new Intent(MainActivity.this, Activity2.class);
                            jumppage.putExtra("Amount", inputAmount);
                            jumppage.putExtra("Price", piattosstr);
                            jumppage.putExtra("image",R.drawable.piattos);
                            jumppage.putExtra("change", changestr);
                            startActivity(jumppage);
                        }
                    });
                } else {
                    TextView piattostxt = findViewById(R.id.textPiattos);
                    piattostxt.setTextColor(Color.parseColor("#FF0000"));
                }
                if (convertedAmount >=30) {
                    //Vcut
                    TextView vcuttxt = findViewById(R.id.textVcut);
                    String vcutstr = vcuttxt.getText().toString();

                    int change = convertedAmount - 30;
                    String changestr = String.valueOf(change);

                    vcuttxt.setTextColor(Color.parseColor("#00FF00"));
                    vcutbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent jumppage = new Intent(MainActivity.this, Activity2.class);
                            jumppage.putExtra("Amount", inputAmount);
                            jumppage.putExtra("Price", vcutstr);
                            jumppage.putExtra("image",R.drawable.vcut);
                            jumppage.putExtra("change", changestr);
                            startActivity(jumppage);
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