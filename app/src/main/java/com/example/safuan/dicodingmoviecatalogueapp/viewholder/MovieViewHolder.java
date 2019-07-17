package com.example.safuan.dicodingmoviecatalogueapp.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.safuan.dicodingmoviecatalogueapp.R;
import com.example.safuan.dicodingmoviecatalogueapp.model.Movie;
import com.squareup.picasso.Picasso;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    private ImageView imgBanner;
    private TextView txtMovieName;
    private TextView txtMovieDesc;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);

        imgBanner = itemView.findViewById(R.id.image_photo);
        txtMovieName = itemView.findViewById(R.id.name_list);
        txtMovieDesc = itemView.findViewById(R.id.desc_list);
    }

    public void setMovieData(Movie movie){
        Picasso.get()
                .load(movie.getBannerMovie())
                .into(imgBanner);
        txtMovieName.setText(movie.getNameMovie());
        txtMovieDesc.setText(String.valueOf(movie.getRatingMovie()));
    }


}
