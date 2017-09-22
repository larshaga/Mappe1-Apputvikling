package com.example.larsh.mappe1;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class HangmanActivity extends AppCompatActivity
{

    byte numberOfWrongtries;
    private LinearLayout Layout;
    String selectedWord;
    TextView[] textViewArray = new TextView[50];
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


        selectedWord = selectRandomWordUsingRandomNumber(generateRandomNumber());
        countLettersInWordAndSetToLayout(selectedWord);

        Log.i("Word", "Selected word: " + selectedWord);


        // Buttons
        btn_q.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("q"))
                    {

                        Log.i("Button", "You guessed a right character");
                        btn_q.setEnabled(false);

                    }
                    else
                    {
                        btn_q.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_w.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("w"))
                    {
                        btn_w.setEnabled(false);

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_w.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_e.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("e");
                    btn_e.setEnabled(false);
                }
                else
                {
                    return;
                }
            }
        });

        btn_r.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("r"))
                    {
                        btn_r.setEnabled(false);

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_r.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_t.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("t"))
                    {
                        btn_t.setEnabled(false);

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_t.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_y.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("y"))
                    {
                        btn_y.setEnabled(false);

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_y.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_u.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("u"))
                    {
                        btn_u.setEnabled(false);

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_u.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_i.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("i"))
                    {
                        btn_i.setEnabled(false);

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_i.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_o.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("o"))
                    {
                        btn_o.setEnabled(false);

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_o.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_p.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("p"))
                    {
                        btn_p.setEnabled(false);

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_p.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_a.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("a"))
                    {
                        btn_a.setEnabled(false);


                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_a.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_s.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("s"))
                    {
                        btn_s.setEnabled(false);


                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_s.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_d.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("d"))
                    {
                        btn_d.setEnabled(false);

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_d.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_f.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("f"))
                    {
                        btn_f.setEnabled(false);


                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_f.setEnabled(false);
                    }
                }
                else
                {
                    return;
                }
            }
        });

        btn_g.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    if (isCharInWord("g"))
                    {
                        btn_g.setEnabled(false);

                        Log.i("Button", "You guessed a right character");
                    }
                    else
                    {
                        btn_g.setEnabled(false);
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
                        if (isCharInWord("å"))
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


    boolean isCharInWord( String guessedCharacter )
    {

        if (selectedWord.toLowerCase().contains(guessedCharacter))
        {
            Log.i("Char", "True!");
            // Set the char in the correct place

            Log.i("char at place", String.valueOf(selectedWord.indexOf(guessedCharacter)));
            
            textViewArray[selectedWord.indexOf(guessedCharacter)].setText(guessedCharacter);


            return true;
        }
        else
        {
            numberOfWrongtries++;
            Log.i("Char", "False! " + "You have tried: " + numberOfWrongtries + " number of times." + "\n" + "You have tries " + (6 - numberOfWrongtries) + "left");
            //add another hangman figure
            return false;
        }
    }


    boolean checkNumberOfTries( )
    {

        if (numberOfWrongtries < 6)
        {
            return true;
        }
        Intent youAreDead = new Intent(this, DeadActivity.class);
        youAreDead.putExtra("selectedWord", selectedWord);
        startActivity(youAreDead);
        return false;
    }


    int generateRandomNumber( )
    {

        Random generatedRandomeNumber = new Random();
        // Generates a randome number between 0 and 9 (total 10 different numbers)
        int randomNumber = generatedRandomeNumber.nextInt((9 - 0) + 1);

        return randomNumber;
    }

    String selectRandomWordUsingRandomNumber( int randomNumber )
    {

        String[] wordsFromFile = getResources().getStringArray(R.array.words);
        String selectedRandomWord = wordsFromFile[randomNumber];
        selectedWordCharArray = selectedRandomWord.toCharArray();

        return selectedRandomWord;
    }

    void countLettersInWordAndSetToLayout( String selectedRandomWord )
    {

        int numberOfLettersInWord = 0;
        numberOfLettersInWord = selectedRandomWord.length();

        // Gets the layout so i can make lines as many letters is it is in the word
        Layout = (LinearLayout) findViewById(R.id.NumberOfLettersLayout);

        for (int i = 0; i < numberOfLettersInWord; i++)
        {
            // Make lines as many as the numbers of letters in the selected word
            TextView createdTextView = new TextView(this);
            createdTextView.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            createdTextView.setId(i);
            createdTextView.setText("   ");
            createdTextView.setPadding(30, 30, 30, 30);
            createdTextView.setPaintFlags(createdTextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
            createdTextView.setTextSize(40);
            Layout.addView(createdTextView);

            textViewArray[i] = (TextView) findViewById(i);
        }

    }


    void testing( )
    {

        textViewArray[1].setText("a");
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

}
