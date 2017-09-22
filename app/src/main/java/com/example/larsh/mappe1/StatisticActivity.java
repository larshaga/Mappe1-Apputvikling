package com.example.larsh.mappe1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StatisticActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);

        TextView NumberOfVictories = (TextView) findViewById(R.id.txte_NumberOfVictories);
        TextView NumberOfDefeats = (TextView) findViewById(R.id.txte_NumberOfDefeats);


        NumberOfDefeats.setText(getSharedPreferences("numberOfDefeats",MODE_PRIVATE).getString("NumberOfDefeats",""));
        NumberOfVictories.setText(getSharedPreferences("Preference",MODE_PRIVATE).getString("Hovedtekst",""));

    }

    @Override
    protected void onResume()
    {
        super.onResume();


    }
}
