package com.udacity.jonathan.myplaylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HiphopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiphop);


        ArrayList<String> songs = new ArrayList<String>();

        songs.add("Shake Shake it Booty!");
        songs.add("Crunches everyday");
        songs.add("Squatty Squatty");
        songs.add("Looking Good");
        songs.add("Lost 30 lbs");
        songs.add("Biceps for life");
        songs.add("Skip legs everyday");
        songs.add("Weak Chicken Legs");
        songs.add("Golden Standard 30%");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);


        //Find ListView id
        ListView listView = (ListView) findViewById(R.id.hiphop_list);


        listView.setAdapter(itemsAdapter);



    }
}
