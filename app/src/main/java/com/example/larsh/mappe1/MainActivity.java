package com.example.larsh.mappe1;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
        final Button btn_Statistic = (Button)findViewById(btn_seeStatistic);

        btn_Rules.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {

                Log.i("Button","Rules");
                Intent seeRules = new Intent(MainActivity.this,RulesActivity.class);
                startActivity(seeRules);
            }
        });

        btn_startGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Log.i("Button","Start game");
                Intent startGame = new Intent(MainActivity.this, HangmanActivity.class);
                startActivity(startGame);
            }
        });

        btn_Language.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Log.i("Button","Change language");





            }
        });

        btn_Statistic.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Log.i("Button","see statistic");
                Intent seeStatistic = new Intent(MainActivity.this,StatisticActivity.class);
                startActivity(seeStatistic);
            }
        });


    }

}