package com.udacity.jonathan.myplaylist;

public class Song {
    private String playlistSongName;
    private String playlistArtistName;

    public Song(String defaultSongName, String artistName){
        playlistSongName = defaultSongName;
        playlistArtistName = artistName;
    }


    public String getPlaylistSongName(){

        return playlistSongName;
    }


    public String getPlaylistArtistName(){

        return playlistArtistName;
    }

}
