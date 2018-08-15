package com.udacity.jonathan.myplaylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FocusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Sorry"," by Justin Bieber"));
        songs.add(new Song("Trap Queen"," by Fetty Wap"));
        songs.add(new Song("Mmm Yeah"," by Austin Mahone"));
        songs.add(new Song("Make It Rain"," by Fat Joe"));
        songs.add(new Song("Hail Mary"," by 2Pac"));
        songs.add(new Song("We Outchea"," by Ace Hood"));

        SongAdapter adapter = new SongAdapter(this, songs);

        //Find ListView id
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
