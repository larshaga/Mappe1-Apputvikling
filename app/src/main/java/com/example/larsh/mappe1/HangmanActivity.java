package com.example.larsh.mappe1;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.io.InputStream;
import java.util.Random;

import static java.security.AccessController.getContext;

public class HangmanActivity extends AppCompatActivity
{

    byte antallforsøk;
    private LinearLayout Layout;
    String selectedWord;

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


        selectedWord = selectRandomeWordUsingRandomNumber(generateRandomeNumber());
        countLettersInWordAndSetToLayout(selectedWord);

        Log.i("Word", "Selected word: " + selectedWord);

        btn_q.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    // Check if char is used in the word and do something about it.

                    antallforsøk++;
                    isCharInWord("c");
                    Log.i("antallforsøk", String.valueOf(antallforsøk));

                }
                else
                {
                    antallforsøk++;
                    Log.i("antallforsøk", " antall forsøk oversteget " + String.valueOf(antallforsøk));
                    return;
                }
            }
        });

    }


    boolean isCharInWord( String guessedCharacter )
    {

        String charactr = "e";


        Log.i("Char", selectedWord.toLowerCase());
        Log.i("Char", String.valueOf(charactr));
        Log.i("Char1", String.valueOf(selectedWord.toLowerCase().contains(charactr)));
        Log.i("Char2", String.valueOf(selectedWord.toLowerCase().contains(guessedCharacter)));

        return false;
    }


    boolean checkNumberOfTries( )
    {

        if (antallforsøk < 6)
        {
            return true;
        }
        return false;
    }


    int generateRandomeNumber( )
    {

        Random generatedRandomeNumber = new Random();
        // Generates a randome number between 0 and 9 (total 10 different numbers)
        int randomNumber = generatedRandomeNumber.nextInt((9 - 0) + 1);

        return randomNumber;
    }

    String selectRandomeWordUsingRandomNumber( int randomeNumber )
    {

        String[] wordsFromFile = getResources().getStringArray(R.array.words);
        String selectedRandomeWord = wordsFromFile[randomeNumber];

        return selectedRandomeWord;
    }


    void countLettersInWordAndSetToLayout( String selectedWord )
    {

        int numberOfLettersInWord = 0;
        numberOfLettersInWord = selectedWord.length();

        // Gets the layout so i can make lines as many letters is it is in the word
        Layout = (LinearLayout) findViewById(R.id.NumberOfLettersLayout);

        for (int i = 0; i < numberOfLettersInWord; i++)
        {
            // Make lines as many as the numbers of letters in the selected word
            Button createdButton = new Button(this);
            createdButton.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            createdButton.setText("Test");
            Layout.addView(createdButton);

        }
    }


}
