package com.asrori201011401455.utsapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class GenreFragment extends Fragment {
    private List<String> arr;
    private GenreAdapter genreAdapter;
    private RecyclerView recyclerView;
    private String[] bookGenre;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_genre, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        arr = new ArrayList<>();
        bookGenre = new String[]{
                getString(R.string.g1),
                getString(R.string.g2),
                getString(R.string.g3),
                getString(R.string.g4),
                getString(R.string.g5),
                getString(R.string.g6),
                getString(R.string.g7),
                getString(R.string.g8),
                getString(R.string.g9),
                getString(R.string.g10),
                getString(R.string.g11),
                getString(R.string.g12),
                getString(R.string.g13),
                getString(R.string.g14),
                getString(R.string.g15),
                getString(R.string.g16),
                getString(R.string.g17),
                getString(R.string.g18),
                getString(R.string.g19),
                getString(R.string.g20),
                getString(R.string.g21),
        };
        for (int i=0; i<bookGenre.length; i++){
            arr.add(bookGenre[i]);
        }

        genreAdapter = new GenreAdapter(arr);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(genreAdapter);

        return view;
    }

}