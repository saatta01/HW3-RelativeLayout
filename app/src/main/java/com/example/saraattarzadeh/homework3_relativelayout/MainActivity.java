package com.example.saraattarzadeh.homework3_relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lizardClickHandler(View view)
    {

            Toast toast = Toast.makeText(this, "Lizard was clicked!", Toast.LENGTH_SHORT);
            toast.show();
    }

    public void rockClickHandler(View view)
    {

        Toast toast = Toast.makeText(this, "Rock was clicked!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void paperClickHandler(View view)
    {

        Toast toast = Toast.makeText(this, "Paper was clicked!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void scissorsClickHandler(View view)
    {

        Toast toast = Toast.makeText(this, "Scissors was clicked!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void spockClickHandler(View view)
    {

        Toast toast = Toast.makeText(this, "Spock was clicked!", Toast.LENGTH_SHORT);
        toast.show();
    }

}

