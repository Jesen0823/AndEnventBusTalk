package com.jesen.andenventbustalk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button toSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toSecond = findViewById(R.id.toSecond);
        toSecond.setOnClickListener(view -> toSecondPage());
    }

    private void toSecondPage() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

}