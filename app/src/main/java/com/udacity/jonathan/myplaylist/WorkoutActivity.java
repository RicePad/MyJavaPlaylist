package com.udacity.jonathan.myplaylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Panda"," by Desiigner"));
        songs.add(new Song("‘Till I Collapse"," by Eminem"));
        songs.add(new Song("One Dance"," by Drake"));
        songs.add(new Song("Jumpman"," by Drake"));
        songs.add(new Song("Power"," by Kanye West"));
        songs.add(new Song("Booty Shake"," by Drake"));



        SongAdapter adapter = new SongAdapter(this, songs);



        //Find ListView id
        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);





    }
}
