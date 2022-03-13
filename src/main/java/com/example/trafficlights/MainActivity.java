package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.BLUE);
    }
    public void onClick1(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.BLACK);
    }
    public void onClick2(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.RED);
    }
}