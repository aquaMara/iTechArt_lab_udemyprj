package com.aquam.unit_8.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String title) {
        for (Song oneSong : songs) {
            if (oneSong.getTitle().equals(title))
                return oneSong;
        }
        return null;
    }

    public boolean addToPlayList(int songNumber, LinkedList<Song> playList) {
        // !!! - songNumber starts at 1
        if (songNumber > 0 && songNumber <= songs.size()) {
            playList.add(songs.get(songNumber - 1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song currentSong = findSong(title);
        if (currentSong != null) {
            playList.add(currentSong);
            return true;
        }
        System.out.println("This song " + title + " is not in the album");
        return false;
    }
}
