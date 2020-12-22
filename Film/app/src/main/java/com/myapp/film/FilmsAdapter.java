package com.myapp.film;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.FilmsHolder> {

    Content[] contents;

    public FilmsAdapter(Content[] contents) {
        this.contents = new Content[contents.length];
        this.contents = contents;
    }

    @NonNull
    @Override
    public FilmsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent, false);
        return new FilmsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmsHolder holder, int position) {
        holder.image.setImageURI(Uri.parse(contents[position].getImage()));
        holder.text.setText(contents[position].getName());
    }

    @Override
    public int getItemCount() {
        return this.contents.length;
    }

    class FilmsHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView text;

        public FilmsHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.cicleImage);
            text  = itemView.findViewById(R.id.filmsName);
        }
    }
}
