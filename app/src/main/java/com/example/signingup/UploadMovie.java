package com.example.signingup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UploadMovie extends AppCompatActivity implements View.OnClickListener {

    /* the movie name text bar input */
    private EditText movieInput;
    /* the upload button */
    private TextView upload;

    /* firebase object */
    FirebaseDatabase database;
    /* firebase reference to the root */
    DatabaseReference rootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_movie);

        movieInput = (EditText) findViewById(R.id.movieInput);

        upload = findViewById(R.id.upload);
        upload.setOnClickListener(this);

        /* set the path to movies table */
        database = FirebaseDatabase.getInstance();
        rootRef = database.getReference("Movies");
    }

    /* this function called when the upload button is pressed */
    private void uploadMovie() {
        String movieName = movieInput.getText().toString().trim();
        Toast.makeText(UploadMovie.this, "Movie: " + movieName +" Uploaded", Toast.LENGTH_LONG).show();

        Movie movie = new Movie();
        movie.setMovieName(movieName);
        movie.setGenre(Genre.ACTION);

        /* set an ID from the database */
        movie.setMovieID(rootRef.push().getKey());
        /* insert the movie by its ID */
        rootRef.child(movie.getMovieID()).setValue(movie);


        Toast.makeText(this, "success!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.upload:
                uploadMovie();
                break;
        }

    }
}