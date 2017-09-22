package com.example.larsh.mappe1;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;
import java.util.Random;

public class HangmanActivity extends AppCompatActivity
{

    byte numberOfWrongtries;
    String selectedWordString;
    char[] selectedWordCharArray;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman);

        final Button btn_q = (Button) findViewById(R.id.btn_q);
        final Button btn_w = (Button) findViewById(R.id.btn_w);
        final Button btn_e = (Button) findViewById(R.id.btn_e);
        final Button btn_r = (Button) findViewById(R.id.btn_r);
        final Button btn_t = (Button) findViewById(R.id.btn_t);
        final Button btn_y = (Button) findViewById(R.id.btn_y);
        final Button btn_u = (Button) findViewById(R.id.btn_u);
        final Button btn_i = (Button) findViewById(R.id.btn_i);
        final Button btn_o = (Button) findViewById(R.id.btn_o);
        final Button btn_p = (Button) findViewById(R.id.btn_p);
        final Button btn_a = (Button) findViewById(R.id.btn_a);
        final Button btn_s = (Button) findViewById(R.id.btn_s);
        final Button btn_d = (Button) findViewById(R.id.btn_d);
        final Button btn_f = (Button) findViewById(R.id.btn_f);
        final Button btn_g = (Button) findViewById(R.id.btn_g);
        final Button btn_h = (Button) findViewById(R.id.btn_h);
        final Button btn_j = (Button) findViewById(R.id.btn_j);
        final Button btn_k = (Button) findViewById(R.id.btn_k);
        final Button btn_l = (Button) findViewById(R.id.btn_l);
        final Button btn_z = (Button) findViewById(R.id.btn_z);
        final Button btn_x = (Button) findViewById(R.id.btn_x);
        final Button btn_c = (Button) findViewById(R.id.btn_c);
        final Button btn_v = (Button) findViewById(R.id.btn_v);
        final Button btn_b = (Button) findViewById(R.id.btn_b);
        final Button btn_n = (Button) findViewById(R.id.btn_n);
        final Button btn_m = (Button) findViewById(R.id.btn_m);
        final Button btn_æ = (Button) findViewById(R.id.btn_æ);
        final Button btn_ø = (Button) findViewById(R.id.btn_ø);
        final Button btn_å = (Button) findViewById(R.id.btn_å);



        selectedWordString = String.valueOf(selectRandomWordUsingRandomNumber(generateRandomNumber()));
        Log.i("selectedWordString",selectedWordString);
        Log.i("selectedWordCharArray", String.valueOf(selectedWordCharArray));

        countLettersInWordAndSetToLayout(selectedWordCharArray);


        //selectedWord = selectRandomWordUsingRandomNumber(generateRandomeNumber());
        //countLettersInWordAndSetToLayout(selectedWord);

        //Log.i("Word", "Selected word: " + selectedWordString);


        // Buttons
        btn_q.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    Log.i("if","if");
                    if (isCharInWord('q'))
                    {

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                            //btn_q.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });


        // Checks if the locale is norwegian 'nb', if not returns.
        if (Locale.getDefault().getLanguage().contains("nb"))
        {

            btn_æ.setOnClickListener(new View.OnClickListener()
            {

                public void onClick( View v )
                {

                    if (checkNumberOfTries())
                    {
                        // Check if char is used in the word and do something about it.

                        Log.i("Button", "æ is pressed");

                    }
                    else
                    {
                        return;
                    }
                }
            });

            btn_ø.setOnClickListener(new View.OnClickListener()
            {

                public void onClick( View v )
                {

                    if (checkNumberOfTries())
                    {
                        // Check if char is used in the word and do something about it.

                        Log.i("Button", "ø is pressed");

                    }
                    else
                    {
                        return;
                    }
                }
            });

            btn_å.setOnClickListener(new View.OnClickListener()
            {

                public void onClick( View v )
                {

                    if (checkNumberOfTries())
                    {
                        if (isCharInWord('å'))
                        {
                            Log.i("Button", "You guessed a right character");
                        }
                        else
                        {
                            btn_å.setEnabled(false);
                        }
                    }
                    else
                    {
                        return;
                    }
                }
            });
        }
        else
        {
            // Not set to norwegian 'nb' language, disabling æøå setOnClickListener
            return;
        }

    }


    boolean isCharInWord( char guessedCharacter )
    {
        /*if ()
        {
            Log.i("Char", "True!");

            return true;
        }
        else
        {
            Log.i("Char", "False!");
            numberOfWrongtries++;

            //add another hangman figure

            return false;
        }


        if (selectedWordString.toLowerCase().contains(guessedCharacter))
        {
            Log.i("Char", "True!");


            return true;
        }
        else
        {
            Log.i("Char", "False!");
            numberOfWrongtries++;
            //add another hangman figure
            return false;
        }
        */
        return false;
    }


    boolean checkNumberOfTries( )
    {

        if (numberOfWrongtries < 6)
        {
            Log.i("Wront tries, true", String.valueOf(numberOfWrongtries));
            numberOfWrongtries++;
            return true;
        }
        numberOfWrongtries++;
        Log.i("Wrong tries", String.valueOf(numberOfWrongtries));
        Intent youAreDead = new Intent(this, DeadActivity.class);
        youAreDead.putExtra("selectedWord", selectedWordString);
        startActivity(youAreDead);

        return false;
    }


    int generateRandomNumber( )
    {

        Random generatedRandomeNumber = new Random();
        // Generates a randome number between 0 and 9 (total 10 different numbers)
        int randomNumber = generatedRandomeNumber.nextInt((9 - 0) + 1);
        Log.i("generateRandomNumber", String.valueOf(randomNumber));

        return randomNumber;

    }

    char[] selectRandomWordUsingRandomNumber( int randomNumber )
    {
        String[] wordsFromFile = getResources().getStringArray(R.array.words);
        String selectedWordFromRandom = wordsFromFile[randomNumber];
        selectedWordCharArray = selectedWordFromRandom.toCharArray();

        return selectedWordCharArray;
    }


    void countLettersInWordAndSetToLayout( char[] selectedRandomWord )
    {
        int numberOfLettersInWord = 0;
        numberOfLettersInWord = selectedRandomWord.length;

        TextView numberOfLettersTextView = (TextView) findViewById(R.id.AllLetters);

        numberOfLettersTextView.setPaintFlags(numberOfLettersTextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        numberOfLettersTextView.setLetterSpacing((float) 0.2);









        /*
        for (int i = 0; i < numberOfLettersInWord; i++)
        {
            // Make lines as many as the numbers of letters in the selected word

            createdTextView.setId(i);
            Log.i("LayoutID", String.valueOf(createdTextView.getId()));

            //createdTextView.findViewById(i);

            createdTextView.setText("   ");
            createdTextView.setPadding(30, 30, 30, 30);

            Layout.addView(createdTextView);
        }
        */
    }

    @Override
    protected void onSaveInstanceState( Bundle outState )
    {

        super.onSaveInstanceState(outState);

    }

    protected void onRestoreInstanceState( Bundle savedInstanceState )
    {

        super.onRestoreInstanceState(savedInstanceState);

    }


    protected void onPause( )
    {

        super.onPause();

    }

}
