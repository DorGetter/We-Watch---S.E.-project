package com.example.signingup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class VOD extends AppCompatActivity implements View.OnClickListener {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_o_d);

        //Assign variable
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //Main layout

            //Tool Bar
            case R.id.LogoCategory:
                break;
            case R.id.Comedy:
                break;
            case R.id.Action:
                break;
            case R.id.Horror:
                break;
            case R.id.Family:
                break;
        }
    }
    public void ClickMenu(View view){
        //Open drawer
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public void Comedy(View view){
        Toast.makeText(VOD.this, "Comedy pressed",Toast.LENGTH_LONG).show();
    }

//    public void ClickLogo(View view) {
//        //Close drawer layout
//        //Check condition
//        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
//            //When drawer is open -> close drawer
//            drawerLayout.closeDrawer(GravityCompat.START);
//        }
//    }


    @Override
    protected void onPause() {
        super.onPause();
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            //When drawer is open -> close drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }


}