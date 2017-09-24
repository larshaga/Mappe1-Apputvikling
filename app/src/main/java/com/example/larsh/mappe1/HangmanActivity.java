package com.example.larsh.mappe1;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

import static com.example.larsh.mappe1.R.id.LettersLayout;
import static com.example.larsh.mappe1.R.id.btn_æ;
import static com.example.larsh.mappe1.R.id.btn_ø;
import static com.example.larsh.mappe1.R.id.hangman_arm_left;
import static com.example.larsh.mappe1.R.id.hangman_body;
import static com.example.larsh.mappe1.R.id.hangman_head;
import static com.example.larsh.mappe1.R.id.hangman_leg_left;
import static com.example.larsh.mappe1.R.id.text;

public class HangmanActivity extends AppCompatActivity
{

    byte numberOfWrongtries = 0;
    private LinearLayout Layout;
    String selectedWord;
    int numberOfCorrectChars = 0;
    int countHowManyTimesYouHaveWon;
    TextView[] textViewArray;


    @Override
    protected void onCreate( Bundle savedInstanceState )
    {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        int countHowManyTimesYouHaveWon = preferences.getInt("HOWMANYTIMESYOUHAVEWON", -1);

        Log.i("howManyTimesfromsave", String.valueOf(countHowManyTimesYouHaveWon));


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
                    isCharInWord("q");
                    btn_q.setEnabled(false);
                }
            }
        });

        btn_w.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("w");
                    btn_w.setEnabled(false);
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
            }
        });

        btn_r.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("r");
                    btn_r.setEnabled(false);
                }
            }
        });
        btn_t.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("t");
                    btn_t.setEnabled(false);
                }
            }
        });
        btn_y.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("y");
                    btn_y.setEnabled(false);
                }
            }
        });
        btn_u.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("u");
                    btn_u.setEnabled(false);
                }
            }
        });
        btn_i.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("i");
                    btn_i.setEnabled(false);
                }
            }
        });
        btn_o.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("o");
                    btn_o.setEnabled(false);
                }
            }
        });
        btn_p.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("p");
                    btn_p.setEnabled(false);
                }
            }
        });
        btn_a.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("a");
                    btn_a.setEnabled(false);
                }
            }
        });
        btn_s.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("s");
                    btn_s.setEnabled(false);
                }
            }
        });
        btn_d.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("d");
                    btn_d.setEnabled(false);
                }

            }
        });
        btn_f.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("f");
                    btn_f.setEnabled(false);
                }

            }
        });
        btn_g.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("g");
                    btn_g.setEnabled(false);
                }

            }
        });
        btn_h.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("h");
                    btn_h.setEnabled(false);
                }

            }
        });
        btn_j.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("j");
                    btn_j.setEnabled(false);
                }

            }
        });
        btn_k.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("k");
                    btn_k.setEnabled(false);
                }

            }
        });
        btn_l.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("l");
                    btn_l.setEnabled(false);
                }

            }
        });
        btn_z.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("z");
                    btn_z.setEnabled(false);
                }

            }
        });
        btn_x.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("x");
                    btn_x.setEnabled(false);
                }

            }
        });
        btn_c.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("c");
                    btn_c.setEnabled(false);
                }

            }
        });
        btn_v.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("v");
                    btn_v.setEnabled(false);
                }

            }
        });
        btn_b.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("b");
                    btn_b.setEnabled(false);
                }

            }
        });
        btn_n.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("n");
                    btn_n.setEnabled(false);
                }

            }
        });
        btn_m.setOnClickListener(new View.OnClickListener()
        {

            public void onClick( View v )
            {

                if (checkNumberOfTries())
                {
                    isCharInWord("m");
                    btn_m.setEnabled(false);
                }

            }
        });


        // Checks if the locale is norwegian 'nb'.
        if (getResources().getConfiguration().locale.getLanguage().contains("nb"))

            if (Locale.getDefault().getLanguage().contains("nb"))
            {

                btn_æ.setOnClickListener(new View.OnClickListener()
                {

                    public void onClick( View v )
                    {

                        if (checkNumberOfTries())
                        {
                            isCharInWord("æ");
                            btn_æ.setEnabled(false);
                        }

                    }
                });

                btn_ø.setOnClickListener(new View.OnClickListener()
                {

                    public void onClick( View v )
                    {

                        if (checkNumberOfTries())
                        {
                            isCharInWord("ø");
                            btn_ø.setEnabled(false);
                        }

                    }
                });


                btn_å.setOnClickListener(new View.OnClickListener()
                {

                    public void onClick( View v )
                    {

                        if (checkNumberOfTries())
                        {
                            isCharInWord("å");
                            btn_å.setEnabled(false);
                        }

                    }
                });
            }

    }


    boolean isCharInWord( String guessedCharacter )
    {

        ImageView hangmanHead = (ImageView) findViewById(R.id.hangman_head);
        ImageView hangmanBody = (ImageView) findViewById(R.id.hangman_body);
        ImageView hangmanArmLeft = (ImageView) findViewById(R.id.hangman_arm_left);
        ImageView hangmanArmRight = (ImageView) findViewById(R.id.hangman_arm_right);
        ImageView hangmanLegLeft = (ImageView) findViewById(R.id.hangman_leg_left);
        ImageView hangmanLegRight = (ImageView) findViewById(R.id.hangman_leg_right);

        if (selectedWord.toLowerCase().contains(guessedCharacter))
        {
            Log.i("Char", "True!");
            // Set the char in the correct place
            if (selectedWord.toLowerCase().lastIndexOf(guessedCharacter) == selectedWord.toLowerCase().indexOf(guessedCharacter))
            {

                textViewArray[selectedWord.toLowerCase().indexOf(guessedCharacter)].setText(guessedCharacter);
                numberOfCorrectChars++;

            }
            else
            {

                Log.i("Char", "there is more than one letter in the word that matches");
                textViewArray[selectedWord.toLowerCase().indexOf(guessedCharacter)].setText(guessedCharacter);
                textViewArray[selectedWord.toLowerCase().lastIndexOf(guessedCharacter)].setText(guessedCharacter);
                numberOfCorrectChars += 2;

            }

            if (numberOfCorrectChars == selectedWord.length())
            {
                youWon();
            }


            return true;
        }
        else
        {
            numberOfWrongtries++;
            Log.i("Char", "False! " + "You have tried: " + numberOfWrongtries + " number of times." + "\n" + "You have tries " + (6 - numberOfWrongtries) + "left");
            //add another hangman figure
            switch (numberOfWrongtries)
            {
                case 1:
                    hangmanHead.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    hangmanBody.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    hangmanArmLeft.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    hangmanArmRight.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    hangmanLegLeft.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    hangmanLegRight.setVisibility(View.VISIBLE);
                    break;
            }


            return false;
        }


    }


    void youWon( )
    {

        Log.i("you won", "you won");
        LinearLayout disableLetters = (LinearLayout) findViewById(R.id.LettersLayout);

        AlertDialog youWonAlertDialog = new AlertDialog.Builder(HangmanActivity.this).create();
        youWonAlertDialog.setTitle(getString(R.string.you_won));
        youWonAlertDialog.setMessage(getString(R.string.you_won_message));
        youWonAlertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No.", new DialogInterface.OnClickListener()
        {

            public void onClick( DialogInterface dialog, int which )
            {

                dialog.dismiss();
                finish();
            }
        });

        youWonAlertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes!", new DialogInterface.OnClickListener()
        {

            public void onClick( DialogInterface dialog, int which )
            {

                dialog.dismiss();
                recreate();
            }
        });

        youWonAlertDialog.show();

        disableLetters.setVisibility(View.INVISIBLE);

        countHowManyTimesYouHaveWon++;
    }


    boolean checkNumberOfTries( )
    {

        if (numberOfWrongtries < 5)
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
        // Generates a random number between 0 and 9 (total 10 different numbers)
        int randomNumber = generatedRandomeNumber.nextInt((9 - 0) + 1);

        return randomNumber;
    }

    String selectRandomWordUsingRandomNumber( int randomNumber )
    {

        String[] wordsFromFile = getResources().getStringArray(R.array.words);
        String selectedRandomWord = wordsFromFile[randomNumber]; ;

        return selectedRandomWord;
    }

    void countLettersInWordAndSetToLayout( String selectedRandomWord )
    {

        TextView[] lengthOfLetterArray = new TextView[selectedWord.length()];
        textViewArray = lengthOfLetterArray;

        // Gets the layout so i can make lines as many letters is it is in the word
        Layout = (LinearLayout) findViewById(R.id.NumberOfLettersLayout);

        for (int i = 0; i < selectedRandomWord.length(); i++)
        {
            // Make lines as many as the numbers of letters in the selected word
            TextView createdTextView = new TextView(this);
            createdTextView.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            createdTextView.setId(i);
            createdTextView.setText("  ");
            createdTextView.setPadding(30, 30, 30, 30);
            createdTextView.setPaintFlags(createdTextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
            createdTextView.setTextSize(40);


            Layout.addView(createdTextView);

            textViewArray[i] = (TextView) findViewById(i);

        }
    }

    protected void onPause( )
    {

        super.onPause();

        getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .edit()
                .putInt("HOWMANYTIMESYOUHAVEWON", countHowManyTimesYouHaveWon)
                .apply();

        Log.i("HangmanWonSaved", String.valueOf(countHowManyTimesYouHaveWon));

    }


}
