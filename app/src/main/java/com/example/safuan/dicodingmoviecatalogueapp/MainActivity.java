package com.example.safuan.dicodingmoviecatalogueapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.safuan.dicodingmoviecatalogueapp.adapter.MovieAdapter;
import com.example.safuan.dicodingmoviecatalogueapp.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movies;
    private MovieAdapter adapter;

    private RecyclerView listmovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listmovie = findViewById(R.id.rv_movie);

        //1. menyiapkan data yang akan ditampilkan kedalam recyclerview
        movieData();

        //2. layout manager.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listmovie.setLayoutManager(linearLayoutManager);

        //3. mendefinisikan adapternya
        adapter = new MovieAdapter(movies);

        //4. menampilkan data
        listmovie.setAdapter(adapter);

    }

    private void movieData(){
        movies = new ArrayList<>();
        movies.add(new Movie("A Star Is Born", R.drawable.poster_a_star,
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally s career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons."));

        movies.add(new Movie("Aquaman", R.drawable.poster_aquaman,
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm s half-human, half-Atlantean brother and true heir to the throne."));

        movies.add(new Movie("Avenger Infinity", R.drawable.poster_avengerinfinity,
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."));

        movies.add(new Movie("Bird Box", R.drawable.poster_birdbox,
                "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety."));

        movies.add(new Movie("Bohemian Rhapsody ", R.drawable.poster_bohemian,
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock n roll band Queen in 1970. Hit songs become instant classics. When Mercury s increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."));

        movies.add(new Movie("Bumblebee ", R.drawable.poster_bumblebee,
                "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug."));

        movies.add(new Movie("Once Upon a Deadpool ", R.drawable.poster_deadpool,
                "A kidnapped Fred Savage is forced to endure Deadpool s PG-13 rendition of Deadpool 2 as a Princess Bride-esque story thats full of magic, wonder & zero F s."));

        movies.add(new Movie("How to Train Your Dragon: The Hidden World", R.drawable.poster_dragon,
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."));

        movies.add(new Movie("Dragon Ball Super: Broly", R.drawable.poster_dragonball,
                "Earth is peaceful following the Tournament of Power. Realizing that the universes still hold many more strong people yet to see, Goku spends all his days training to reach even greater heights. Then one day, Goku and Vegeta are faced by a Saiyan called Broly who they ve never seen before. The Saiyans were supposed to have been almost completely wiped out in the destruction of Planet Vegeta, so whats this one doing on Earth? This encounter between the three Saiyans who have followed completely different destinies turns into a stupendous battle, with even Frieza (back from Hell) getting caught up in the mix."));

        movies.add(new Movie("Glass", R.drawable.poster_glass,
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men."));

        movies.add(new Movie("Hunter Killer", R.drawable.poster_hunterkiller,
                "Captain Glass of the USS Arkansas discovers that a coup d état is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war."));

        movies.add(new Movie("Mary Poppins Returns", R.drawable.poster_marrypopins,
                "In Depression-era London, a now-grown Jane and Michael Banks, along with Michael's three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives."));

        movies.add(new Movie("Robin Hood", R.drawable.poster_robinhood,
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."));

        movies.add(new Movie("Spider-Man: Into the Spider-Verse ", R.drawable.poster_spiderman,
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson Kingpin Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."));

        movies.add(new Movie("Venom", R.drawable.poster_venom,
                "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own."));
    }
}
