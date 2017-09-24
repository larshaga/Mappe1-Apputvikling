package com.example.larsh.mappe1;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class StatisticActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);
    }


    @Override
    protected void onResume()
    {
        super.onResume();

        TextView editHowManyTimesWon = (TextView) findViewById(R.id.etxt_howmanytimeswon);
        TextView editHowManyTimesLost = (TextView) findViewById(R.id.etxt_howmanytimeslost);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        int howManyTimesUserWon = preferences.getInt("HOWMANYTIMESYOUHAVEWON",-1);
        int howManyTimesUserLost = preferences.getInt("HOWMANYTIMESYOUHAVELOST",-1);

        editHowManyTimesWon.setText(howManyTimesUserWon);
        editHowManyTimesLost.setText(howManyTimesUserLost);


    }

}
