package com.example.aplikasimenumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycler_view_adapter extends RecyclerView.Adapter<recycler_view_adapter.MyViewHolder>{

    private ArrayList<makanan> listmakanan;

    public recycler_view_adapter(ArrayList<makanan> listmakanan) { this.listmakanan = listmakanan; }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        MyViewHolder holder = new MyViewHolder(inflater.inflate(R.layout.recycler_view_row,
                parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        makanan makanan = listmakanan.get(position);

        holder.textView1.setText(makanan.nama_makanan);
        holder.textView2.setText(makanan.harga_makanan);
        holder.imageView.setImageResource(makanan.gambar);

        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(holder.itemView.getContext(), MainActivity2.class);
                it.putExtra("makanan", makanan);

                holder.itemView.getContext().startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listmakanan.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView1, textView2;
        ConstraintLayout itemLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            this.itemLayout = itemView.findViewById(R.id.item_layout);

        }
    }
}
