package com.asrori201011401455.utsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GenreAdapter extends RecyclerView.Adapter<GenreAdapter.GenreViewHolder>{
    List<String> arr;

    public GenreAdapter(List<String> arr) {
        this.arr = arr;
    }

    @NonNull
    @Override
    public GenreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GenreViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_genre,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GenreViewHolder holder, int position) {
        holder.bookGenre.setText(arr.get(position));
    }

    @Override
    public int getItemCount() {
        return  arr.size();
    }

    class GenreViewHolder extends RecyclerView.ViewHolder{
        TextView bookGenre;

        public GenreViewHolder(@NonNull View itemView) {
            super(itemView);
            bookGenre = itemView.findViewById(R.id.genre_text);
        }
    }
}
