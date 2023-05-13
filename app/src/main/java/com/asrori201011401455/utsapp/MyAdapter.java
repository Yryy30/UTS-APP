package com.asrori201011401455.utsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    Context context;
    ArrayList<Books> booksArrayList;

    public MyAdapter(Context context, ArrayList<Books> booksArrayList) {
        this.context = context;
        this.booksArrayList = booksArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_buku,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Books books = booksArrayList.get(position);
        holder.bookTitle.setText(books.bookTitle);
        holder.bookAuthor.setText(books.bookAuthor);
        holder.bookImage.setImageResource(books.bookImage);
    }

    @Override
    public int getItemCount() {
        return booksArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ShapeableImageView bookImage;
        TextView bookTitle;
        TextView bookAuthor;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            bookImage = itemView.findViewById(R.id.title_image);
            bookTitle = itemView.findViewById(R.id.tvHeading);
            bookAuthor = itemView.findViewById(R.id.author);
        }
    }
}
