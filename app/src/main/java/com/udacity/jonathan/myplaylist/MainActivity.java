package com.udacity.jonathan.myplaylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Set intent for workout album
        TextView workoutSongs = (TextView) findViewById(R.id.workout_playlist);
        workoutSongs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, WorkoutActivity.class);
                startActivity(numbersIntent);
            }
        });


        //Set intent for hip hop album
        TextView hipHopSongs = (TextView) findViewById(R.id.hiphop_playlist);
        hipHopSongs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, HiphopActivity.class);
                startActivity(numbersIntent);
            }
        });
        //Set intent for focus album
        TextView focusSongs = (TextView) findViewById(R.id.focus_playlist);
        focusSongs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, HiphopActivity.class);
                startActivity(numbersIntent);
            }
        });


        //Set intent for chill album
        TextView chillSongs = (TextView) findViewById(R.id.chill_playlist);
        chillSongs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, HiphopActivity.class);
                startActivity(numbersIntent);
            }
        });

    }

}
