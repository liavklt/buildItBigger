package com.example.android.jokeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

  private static final String JOKE = "joke";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_joke_display);

    TextView jokeTv = findViewById(R.id.jokeTv);
    Intent intent = getIntent();
    if (intent.hasExtra(JOKE)) {
      String joke = intent.getStringExtra(JOKE);
      jokeTv.setText(joke);
    }
  }


}
