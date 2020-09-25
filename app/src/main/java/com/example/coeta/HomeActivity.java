package com.example.coeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {



    public void playtap(View view) {

        Intent intent = new Intent(getBaseContext(), thirdsem.class);
        startActivity(intent);



    }

    public void playta(View view){

        Intent intent = new Intent(getBaseContext(),fiftsem.class);

        startActivity(intent);
    }
    public void playt(View view){

        Intent intent = new Intent(getBaseContext(),eightsem.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

    }
}