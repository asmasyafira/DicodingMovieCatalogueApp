package com.example.safuan.dicodingmoviecatalogueapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.safuan.dicodingmoviecatalogueapp.DetailMovieActivity;
import com.example.safuan.dicodingmoviecatalogueapp.R;
import com.example.safuan.dicodingmoviecatalogueapp.model.Movie;
import com.example.safuan.dicodingmoviecatalogueapp.viewholder.MovieViewHolder;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    private List<Movie> movie;

    public MovieAdapter(List<Movie> movie) {
        this.movie = movie;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View viewHolder = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listview_movie,viewGroup,false);
        final MovieViewHolder movieViewHolder = new MovieViewHolder(viewHolder);

        viewHolder.getRootView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = viewHolder.getContext();
                int position = movieViewHolder.getAdapterPosition();

                Intent intent = new Intent(context, DetailMovieActivity.class);
                intent.putExtra("MOVIE_DETAIL", movie.get(position));
                context.startActivity(intent);
            }
        });
        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder movieViewHolder, int i) {
        movieViewHolder.setMovieData(movie.get(i));
    }

    @Override
    public int getItemCount() {
        return movie.size();
    }
}
