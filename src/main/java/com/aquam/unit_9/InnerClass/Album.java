package com.aquam.unit_9.InnerClass;

import com.aquam.unit_9.InnerClass.Song;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int songNumber, LinkedList<Song> playList) {
        // !!! - songNumber starts at 1
        Song currentSong = songs.findSong(songNumber);
        if (currentSong != null) {
            playList.add(currentSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song currentSong = songs.findSong(title);
        if (currentSong != null) {
            playList.add(currentSong);
            return true;
        }
        System.out.println("This song " + title + " is not in the album");
        return false;
    }

    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            } else {
                songs.add(song);
                return true;
            }
        }

        private Song findSong(String title) {
            for (Song oneSong : songs) {
                if (oneSong.getTitle().equals(title))
                    return oneSong;
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < songs.size())
                return songs.get(index);

            return null;
        }
    }
}
