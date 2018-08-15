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
        setContentView(R.layout.song_list);


        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Don’t Let Me Down"," by Chainsmokers"));
        songs.add(new Song("Stronger"," by Kanye West"));
        songs.add(new Song("Work"," by Rihanna"));
        songs.add(new Song("Work From Home"," by Fifth Harmony"));
        songs.add(new Song("Ni**as in Paris"," by JAY Z"));
        songs.add(new Song("My House"," by FloRida"));

        SongAdapter adapter = new SongAdapter(this, songs);

        //Find ListView id
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
