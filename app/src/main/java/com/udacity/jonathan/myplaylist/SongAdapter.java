package com.udacity.jonathan.myplaylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentWord = getItem(position);
        TextView playtifyTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        playtifyTextView.setText(currentWord.getPlaylistSongName());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.artist_song_text_view);
        defaultTextView.setText(currentWord.getPlaylistArtistName());


        return listItemView;


    }
}