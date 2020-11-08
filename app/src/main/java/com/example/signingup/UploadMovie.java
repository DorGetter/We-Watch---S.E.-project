package com.example.signingup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UploadMovie extends AppCompatActivity implements View.OnClickListener {

    /* the movie name text bar input */
    private EditText movieInput;
    /* the upload button */
    private TextView upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_movie);

        movieInput = (EditText) findViewById(R.id.movieInput);

        upload = findViewById(R.id.upload);
        upload.setOnClickListener(this);
    }

    /* this function called when the upload button is pressed */
    private void uploadMovie() {
        String movieName = movieInput.getText().toString().trim();
        Toast.makeText(UploadMovie.this, "Movie Uploaded", Toast.LENGTH_LONG).show();
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