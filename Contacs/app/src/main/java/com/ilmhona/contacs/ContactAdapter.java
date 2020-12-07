package com.ilmhona.contacs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private Contact[] contacts;
    private OnItemClickListener localListener;

    interface OnItemClickListener {
        void onItemClick(int position);
    }

    public ContactAdapter(Contact[] contacts, OnItemClickListener listener) {
        this.contacts = new Contact[contacts.length];
        localListener = listener;
        for(int i = 0; i < contacts.length; i++){
            this.contacts[i] = contacts[i];
        }
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.textView.setText(contacts[position].getName());
    }

    @Override
    public int getItemCount() {
        return contacts.length;
    }

    class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView;

        public ContactViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textField);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            localListener.onItemClick(getAdapterPosition());
        }
    }

    public interface contactClickEvent{
        public void onclickEvent(int position);
    }
}
