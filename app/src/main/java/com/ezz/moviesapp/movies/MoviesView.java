package com.ezz.moviesapp.movies;

import com.ezz.moviesapp.models.movies.Movie;

import java.util.ArrayList;

/**
 * Created by samar ezz on 11/10/2017.
 */

public interface MoviesView {
    void showOrHideProgress(boolean show);
    void networkError();
    void noInternet();
    void onMoviesLoaded(ArrayList<Movie> movieArrayList,boolean isFavourite);
    void noFavourites();
}
