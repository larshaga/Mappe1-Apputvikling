package com.example.larsh.mappe1;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

import static com.example.larsh.mappe1.R.id.btn_seeStatistic;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_Rules = (Button) findViewById(R.id.btn_seeRules);
        final Button btn_startGame = (Button) findViewById(R.id.btn_startGame);
        final Button btn_Language = (Button) findViewById(R.id.btn_changeLanguage);
        final Button btn_Statistic = (Button) findViewById(btn_seeStatistic);

        btn_Rules.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick( View v )
            {

                Intent seeRules = new Intent(MainActivity.this, RulesActivity.class);
                startActivity(seeRules);
            }
        });

        btn_startGame.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick( View v )
            {

                Intent startGame = new Intent(MainActivity.this, HangmanActivity.class);
                startActivity(startGame);
            }
        });


        btn_Language.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick( View v )
            {
                // Checks if the language is set to nb (norwegian), if not it sets it to nb. If it is set to nb, sets it to en. Then recreates the activity for the changes to apply.
                if (!Locale.getDefault().getLanguage().contains("nb"))
                {
                    Locale locale = new Locale("nb");
                    Locale.setDefault(locale);
                    Configuration config = getBaseContext().getResources().getConfiguration();
                    config.locale = locale;
                    getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());


                    Toast langToNor = Toast.makeText(MainActivity.this, R.string.language_to_nor, Toast.LENGTH_LONG);
                    langToNor.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                    langToNor.show();


                    recreate();


                }
                else if (!Locale.getDefault().getLanguage().contains("en"))
                {
                    Locale locale = new Locale("en");
                    Locale.setDefault(locale);
                    Configuration config = getBaseContext().getResources().getConfiguration();
                    config.locale = locale;
                    getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

                    Toast langToEng = Toast.makeText(MainActivity.this, R.string.language_to_eng, Toast.LENGTH_LONG);
                    langToEng.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                    langToEng.show();


                    recreate();
                }
            }
        });

        btn_Statistic.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick( View v )
            {

                Intent seeStatistic = new Intent(MainActivity.this, StatisticActivity.class);
                startActivity(seeStatistic);
            }
        });


    }

}