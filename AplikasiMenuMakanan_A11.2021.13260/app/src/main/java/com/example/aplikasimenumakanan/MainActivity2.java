package com.example.aplikasimenumakanan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView namaTeksView;
    TextView hargaTeksView;
    TextView deskripsiTeksView;
    ImageView gambarImage;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        namaTeksView = findViewById(R.id.nama_makanan);
        hargaTeksView = findViewById(R.id.harga_makanan);
        deskripsiTeksView = findViewById(R.id.deskripsi_makanan);
        gambarImage = findViewById(R.id.gambar_makanan);

        Intent it = getIntent();
        makanan makanan = (makanan) it.getSerializableExtra("makanan");

        namaTeksView.setText(makanan.nama_makanan);
        hargaTeksView.setText(makanan.harga_makanan);
        deskripsiTeksView.setText(makanan.deskripsi);
        gambarImage.setImageResource(makanan.gambar);
    }
}
