package com.example.biodatasaya1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button setMaps, setPhone, setEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan button di xml dengan logic di java
        setPhone=findViewById(R.id.buttonTelepon);
        setEmail=findViewById(R.id.buttonEmail);
        setMaps=findViewById(R.id.buttonAlamat);

        //set onclicklistener untuk tiap button
        setMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGmaps();
            }
        });

        setPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhone();
            }
        });

        setEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGmail();
            }
        });
    }

    //fungsi untuk membuka phone app menggunakan Implicit Intent
    public void openPhone(){
        Uri callNumber=Uri.parse("tel:081327655971");
        Intent callIntent=new Intent(Intent.ACTION_DIAL,callNumber);
        startActivity(callIntent);
    }

    //fungsi untuk membuka email app menggunakan Implicit Intent
    public void openGmail(){
        Uri tujuanEmail=Uri.parse("mailto:111202113260@mhs.dinus.ac.id");
        Intent callIntent=new Intent(Intent.ACTION_SENDTO,tujuanEmail);
        startActivity(callIntent);

    }

    //fungsi untuk membuka maps app menggunakan Implicit Intent
    public void openGmaps(){
        Uri locations = Uri.parse("https://maps.app.goo.gl/cGA4oWbPrSCUXUfZ8");
        Intent intentPeta = new Intent(Intent.ACTION_VIEW, locations);
        startActivity(intentPeta);
    }

}
