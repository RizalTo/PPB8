package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    ArrayList<makanan> listmakanan;
    RecyclerView recMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.menuRecyclerView);
        daftar_makanan();

        recMakanan.setAdapter(new recycler_view_adapter(listmakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));

    }

    private void daftar_makanan(){
        listmakanan = new ArrayList<>();

        listmakanan.add(new makanan("Paket Ayam Goreng", "Rp. 200.000",
                "Paket Ayam Goreng dengan 10 Potong Ayam Yang sangat Nikmat",
                R.drawable.ayamgoreng1));
        listmakanan.add(new makanan("Ayam Geprek", "Rp. 18.000",
                "Ayam Geprek dengan sambal yang dapat dipilih tingkat kepedasannya dari 1-10",
                R.drawable.ayamgeprek));
        listmakanan.add(new makanan("Sate Ayam", "Rp. 20.000",
                "Sate Ayam dengan bumbu kacang yang enak sekali",
                R.drawable.sate));
        listmakanan.add(new makanan("Burger", "Rp. 35.000",
                "Burger dengan isian daging,keju,tomat dan selada siap mengenyangkan perut anda",
                R.drawable.burger));
        listmakanan.add(new makanan("Iga Bakar", "Rp. 84.000",
                "Iga Bakar dengan 100% iga pilihan",
                R.drawable.igabakar));
        listmakanan.add(new makanan("Kentang Goreng", "Rp. 18.000",
                "Kentang Goreng yang dapat menemani waktu cemilan anda",
                R.drawable.kentanggoreng));
        listmakanan.add(new makanan("Ramen", "Rp. 20.000",
                "Salah satu mie dari Jepang yang sangat terkenal di dunia",
                R.drawable.ramen));
        listmakanan.add(new makanan("Sop Buntut", "Rp. 95.000",
                "Sop Buntut dengan kaldu sapi asli ",
                R.drawable.sopbuntut));
        listmakanan.add(new makanan("Paket Sushi", "Rp. 555.000",
                "1 Paket Sushi dengan aneka ragam macam sushi dan harga yang terjangkau",
                R.drawable.sushi));

    }

}