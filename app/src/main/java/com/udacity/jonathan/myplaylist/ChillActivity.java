package com.udacity.jonathan.myplaylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ChillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Boy Oh Boy"," by Diplo"));
        songs.add(new Song("The Beast"," by T.I."));
        songs.add(new Song("One Dance"," by Drake"));
        songs.add(new Song("Forever"," by Drake"));
        songs.add(new Song("Big Rings"," by Drake"));
        songs.add(new Song("Middle"," by DJ Snake"));



        SongAdapter adapter = new SongAdapter(this, songs);



        //Find ListView id
        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);



    }
}
