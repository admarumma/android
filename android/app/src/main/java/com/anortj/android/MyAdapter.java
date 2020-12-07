package com.anortj.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    String[] nameArray = {
            "Umar Adilov", "Halim Ismoilov", "Nurick Voitov",
            "Ilhom Ismoilov", "Murod Sultanov", "Saloh Hasanov",
            "Otabek Hasanov", "Hakim Ismoilov", "Jamshed Ismatov"
    };

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friend, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(nameArray[position]);
    }

    @Override
    public int getItemCount() {
        return nameArray.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.name);
        }
    }

}
