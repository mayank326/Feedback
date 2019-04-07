package com.farmerskorner.feedback;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class BottomNav extends AppCompatActivity {

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        navigationView=(BottomNavigationView)findViewById(R.id.navigation);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_location:

                        break;
                    case R.id.navigation_help:

                        break;
                    case R.id.navigation_feedback:
                        Intent i1 = new Intent(BottomNav.this,MainActivity.class);
                        startActivity(i1);
                        break;
                }
                return true;
            }
        });





    }
}
