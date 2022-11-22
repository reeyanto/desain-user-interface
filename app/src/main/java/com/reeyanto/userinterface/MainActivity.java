package com.reeyanto.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // constraint layout
        setContentView(R.layout.activity_main);

        // linear layout
        //setContentView(R.layout.linear_activity_main);

        // relative layout
        //setContentView(R.layout.relative_activity_main);
    }
}