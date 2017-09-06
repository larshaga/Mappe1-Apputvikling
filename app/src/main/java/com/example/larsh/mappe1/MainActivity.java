package com.example.larsh.mappe1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_seeRules = (Button) findViewById(R.id.btn_seeRules);
        final Button btn_startGame = (Button) findViewById(R.id.btn_startGame);
        final Button btn_changeLanguage = (Button) findViewById(R.id.btn_changeLanguage);
        final Button btn_seeStatistic = (Button) findViewById(R.id.btn_seeStatistic);

        btn_seeRules.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {

                Log.i("Button","Rules");
                //Intent seeRules = new Intent(this,);
                //startActivity(seeRules);
            }
        });

        btn_startGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Log.i("Button","Start game");
                //Intent startGame = new Intent(this, HangmanActivity.class);
                //startActivity(startGame);
            }
        });

        btn_changeLanguage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Log.i("Button","Change language");
                //Intent changeLanguage = new Intent(this,);
                //startActivity(changeLanguage);
            }
        });

        btn_seeStatistic.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Log.i("Button","see statistic");
                //Intent seeStatistic = new Intent(this,);
                //startActivity(seeStatistic);
            }
        });

    }





}