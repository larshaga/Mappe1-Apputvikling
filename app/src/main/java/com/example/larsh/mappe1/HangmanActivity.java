package com.example.larsh.mappe1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HangmanActivity extends AppCompatActivity
{
    byte antallforsøk;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman);

        final Button btn_q = (Button)findViewById(R.id.btn_q);
        final Button btn_w = (Button)findViewById(R.id.btn_w);
        final Button btn_e = (Button)findViewById(R.id.btn_e);
        final Button btn_r = (Button)findViewById(R.id.btn_r);
        final Button btn_t = (Button)findViewById(R.id.btn_t);
        final Button btn_y = (Button)findViewById(R.id.btn_y);
        final Button btn_u = (Button)findViewById(R.id.btn_u);
        final Button btn_i = (Button)findViewById(R.id.btn_i);
        final Button btn_o = (Button)findViewById(R.id.btn_o);
        final Button btn_p = (Button)findViewById(R.id.btn_p);
        final Button btn_a = (Button)findViewById(R.id.btn_a);
        final Button btn_s = (Button)findViewById(R.id.btn_s);
        final Button btn_d = (Button)findViewById(R.id.btn_d);
        final Button btn_f = (Button)findViewById(R.id.btn_f);
        final Button btn_g = (Button)findViewById(R.id.btn_g);
        final Button btn_h = (Button)findViewById(R.id.btn_h);
        final Button btn_j = (Button)findViewById(R.id.btn_j);
        final Button btn_k = (Button)findViewById(R.id.btn_k);
        final Button btn_l = (Button)findViewById(R.id.btn_l);
        final Button btn_z = (Button)findViewById(R.id.btn_z);
        final Button btn_x = (Button)findViewById(R.id.btn_x);
        final Button btn_c = (Button)findViewById(R.id.btn_c);
        final Button btn_v = (Button)findViewById(R.id.btn_v);
        final Button btn_b = (Button)findViewById(R.id.btn_b);
        final Button btn_n = (Button)findViewById(R.id.btn_n);
        final Button btn_m = (Button)findViewById(R.id.btn_m);


        btn_q.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v )
            {
                if (checkNumberOfTries())
                {
                    // Check if char is used in the word and do something about it.

                    antallforsøk++;
                }
                else
                {
                    return;
                }
            }
        });
    }

    boolean checkNumberOfTries ()
    {
        if (antallforsøk < 6)
        {
            return true;
        }
        return false;
    }

}
