package com.example.aplikasimenumakanan;

import java.io.Serializable;

public class makanan implements Serializable {
    String nama_makanan;
    String harga_makanan;
    String deskripsi;
    int gambar;

    public makanan(String nama_makanan, String harga_makanan, String deskripsi, int gambar) {
        this.nama_makanan = nama_makanan;
        this.harga_makanan = harga_makanan;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }
//
//    public String getNama_makanan() {
//        return nama_makanan;
//    }
//
//    public String getHarga_makanan() {
//        return harga_makanan;
//    }
//
//    public String getDeskripsi(){
//        return deskripsi;
//    }
//
//    public int getGambar() {
//        return gambar;
//    }
}
