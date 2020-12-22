package com.myApp.myApp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TypeAdapter extends RecyclerView.Adapter<TypeAdapter.TypeViewHolder> {

    private Type[] types;
    private OnClickType mOnClickType;

    interface OnClickType{
        void onclickType(int position);
    }

    public TypeAdapter(Type[] types, OnClickType onClickType) {
        this.types = new Type[types.length];
        mOnClickType = onClickType;
        this.types = types;
    }

    @NonNull
    @Override
    public TypeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type, parent, false);
        return new TypeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TypeViewHolder holder, int position) {
        holder.typeText.setText(this.types[position].getName());
    }

    @Override
    public int getItemCount () {
        return types.length;
    }

    class TypeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView typeText;

        public TypeViewHolder(@NonNull View itemView) {
            super(itemView);
            typeText = itemView.findViewById(R.id.typeText);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mOnClickType.onclickType(getAdapterPosition());
        }
    }
}