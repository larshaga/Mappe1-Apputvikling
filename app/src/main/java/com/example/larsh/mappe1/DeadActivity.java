package com.example.larsh.mappe1;

import android.content.Intent;
import android.preference.TwoStatePreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.widget.TextView;
import android.widget.Toast;

public class DeadActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        int numberOfDefeats = 0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dead);

        Intent intent = getIntent();
        String word = intent.getExtras().getString("selectedWord");

        TextView displaySelectedWord = (TextView) findViewById(R.id.selectedWord);
        displaySelectedWord.setText("Selected word was: " + word);

        numberOfDefeats++;

        getSharedPreferences("numberOfDefeats",MODE_PRIVATE)
                .edit()
                .putInt("NumberOfDefeat",numberOfDefeats)
                .apply();
    }



}
