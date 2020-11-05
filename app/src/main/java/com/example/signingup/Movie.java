package com.example.signingup;

import java.util.ArrayList;
import java.util.Collection;

public class Movie {
    private String  MovieName   ;
    private String  MovieID     ;
    private Genre   genre       ;
    private String  MovieUrl    ;

    private Collection<String> likes = new ArrayList<>();
    private Collection<String> OwnBy = new ArrayList<>();

    public Movie(){}

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getMovieID() {
        return MovieID;
    }

    public void setMovieID(String movieID) {
        MovieID = movieID;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Collection<String> getLikes() {
        return likes;
    }

    public void setLikes(Collection<String> likes) {
        this.likes = likes;
    }

    public Collection<String> getOwnBy() {
        return OwnBy;
    }

    public void setOwnBy(Collection<String> ownBy) {
        OwnBy = ownBy;
    }
}
