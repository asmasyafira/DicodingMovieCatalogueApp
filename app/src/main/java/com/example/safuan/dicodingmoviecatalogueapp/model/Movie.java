package com.example.safuan.dicodingmoviecatalogueapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String nameMovie;
    private int bannerMovie;
    private String ratingMovie;

    public Movie(String nameMovie, int bannerMovie, String ratingMovie) {
        this.nameMovie = nameMovie;
        this.bannerMovie = bannerMovie;
        this.ratingMovie = ratingMovie;
    }

    protected Movie(Parcel in) {
        nameMovie = in.readString();
        bannerMovie = in.readInt();
        ratingMovie = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getNameMovie() {
        return nameMovie;
    }

    public int getBannerMovie() {
        return bannerMovie;
    }

    public String getRatingMovie() {
        return ratingMovie;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nameMovie);
        dest.writeInt(bannerMovie);
        dest.writeString(ratingMovie);
    }
}
