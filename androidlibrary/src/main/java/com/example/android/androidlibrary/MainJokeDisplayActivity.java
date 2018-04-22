package com.example.android.androidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainJokeDisplayActivity extends AppCompatActivity {

    private TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke_display);
        Intent intent= getIntent();
        if(intent.hasExtra(Intent.EXTRA_TEXT))
        {
            String joke = intent.getStringExtra(Intent.EXTRA_TEXT);
            jokeTextView = findViewById(R.id.joke_text_view_id);
            jokeTextView.setText(joke);
        }
    }
}
