package com.example.kalkulatorbidangdatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText kl1, kl2;
    Button btP, btS, btL;
    TextView tvHL, tvHK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kl1 = (EditText) findViewById(R.id.editTextNumber);
        kl2 = (EditText) findViewById(R.id.editTextNumber2);
        tvHL = (TextView) findViewById(R.id.textviewHL);
        tvHK = (TextView) findViewById(R.id.textviewHK);
        btP = (Button) findViewById(R.id.buttonP);
        btS = (Button) findViewById(R.id.buttonS);
        btL = (Button) findViewById(R.id.buttonL);

        btP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasilL, hasilK;
                bil1 = Double.valueOf(kl1.getText().toString().trim());
                bil2 = Double.valueOf(kl2.getText().toString().trim());
                hasilL = bil1 * bil1;
                String hasil1 = String.valueOf(hasilL);
                tvHL.setText(hasil1);
                hasilK = bil1 * 4;
                String hasil2 = String.valueOf(hasilK);
                tvHK.setText(hasil2);
            }
        });

        btS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasilL, hasilK;
                bil1 = Double.valueOf(kl1.getText().toString().trim());
                bil2 = Double.valueOf(kl2.getText().toString().trim());
                hasilL = bil1 * bil2 / 2;
                String hasil1 = String.valueOf(hasilL);
                tvHL.setText(hasil1);
                hasilK = bil1 * 3;
                String hasil2 = String.valueOf(hasilK);
                tvHK.setText(hasil2);
            }
        });

        btL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasilL, hasilK;
                bil1 = Double.valueOf(kl1.getText().toString().trim());
                bil2 = Double.valueOf(kl2.getText().toString().trim());
                hasilL = 3.14 * bil1 * bil1;
                String hasil1 = String.valueOf(hasilL);
                tvHL.setText(hasil1);
                hasilK = 2 * 3.14 * bil1 / 2;
                String hasil2 = String.valueOf(hasilK);
                tvHK.setText(hasil2);
            }
        });
    }
}