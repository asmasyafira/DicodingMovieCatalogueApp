package com.example.safuan.dicodingmoviecatalogueapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.safuan.dicodingmoviecatalogueapp.model.Movie;
import com.squareup.picasso.Picasso;

public class DetailMovieActivity extends AppCompatActivity {

    private ImageView imageMovie;
    private TextView txtMovieName, txtMovieDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        //casting viewnya

        imageMovie = findViewById(R.id.image_photo);
        txtMovieName = findViewById(R.id.txt_judul);
        txtMovieDesc = findViewById(R.id.txt_desc);

        Movie movie = getIntent().getParcelableExtra("MOVIE_DETAIL");

        Picasso.get().load(movie.getBannerMovie()).into(imageMovie);
        txtMovieName.setText(movie.getNameMovie());
        txtMovieDesc.setText(movie.getRatingMovie());


    }
}
