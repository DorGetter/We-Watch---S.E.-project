package com.example.signingup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class VOD extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_o_d);
        //Assign variable
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view){
        //Open drawer
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public void Logo(View view){
        startActivity(new Intent(this,ProfileUser.class));
    }

    public void LogoCategory(View view){
        startActivity(new Intent(this,ProfileUser.class));
    }

    public void MyMovies(View view){
        Toast.makeText(VOD.this, "My Movies pressed",Toast.LENGTH_SHORT).show();
    }
    public void Comedy(View view){
        Toast.makeText(VOD.this, "Comedy pressed",Toast.LENGTH_SHORT).show();
    }
    public void Action(View view){
        Toast.makeText(VOD.this, "Action pressed",Toast.LENGTH_SHORT).show();
    }
    public void Horror(View view){
        Toast.makeText(VOD.this, "Horror pressed",Toast.LENGTH_SHORT).show();
    }
    public void Family(View view){
        Toast.makeText(VOD.this, "Family pressed",Toast.LENGTH_SHORT).show();
    }
    public void SearchMovie(View view){
        Toast.makeText(VOD.this, "Search Movies pressed",Toast.LENGTH_SHORT).show();

    }
    public void OpenRequestUser(View view){
        Toast.makeText(VOD.this, "Search Movies pressed",Toast.LENGTH_SHORT).show();

    }

    public void ClickLogo(View view) {
        //Close drawer layout
        //Check condition
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            //When drawer is open -> close drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(VOD.this, "$$$$$$$$$$$$$$$$$$$$$$$$",Toast.LENGTH_SHORT).show();
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            //When drawer is open -> close drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }


}