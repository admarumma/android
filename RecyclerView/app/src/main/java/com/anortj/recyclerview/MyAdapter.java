package com.anortj.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String[] nameArray = {
            "Umar Adilov", "Halim Ismoilov", "Nurick Voitov",
            "Ilhom Ismoilov", "Murod Sultanov", "Saloh Hasanov",
            "Otabek Hasanov", "Hakim Ismoilov", "Jamshed Ismatov"
    };

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friend, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
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
