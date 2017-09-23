package com.example.larsh.mappe1;

import android.content.Intent;
import android.preference.TwoStatePreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DeadActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dead);

        Intent intent = getIntent();
        String word = intent.getExtras().getString("selectedWord");

        TextView displaySelectedWord = (TextView) findViewById(R.id.selectedWord);
        displaySelectedWord.setText(getString(R.string.selected_word_was) + " " + word);

        Button btn_playMore = (Button) findViewById(R.id.btn_playAgain);
        btn_playMore.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick( View v )
            {
                Intent playMore = new Intent(DeadActivity.this, HangmanActivity.class);
                startActivity(playMore);

                finish();
            }
        });


    }


}
