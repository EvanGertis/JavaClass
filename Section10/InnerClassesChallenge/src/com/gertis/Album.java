package com.gertis;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    SongList songList = new SongList();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songList.songs = new ArrayList<Song>();
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList)
    {
        int index = trackNumber - 1;
        if((index >= 0 ) && (index <= songList.songs.size()))
        {
            playList.add(songList.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList)
    {
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null)
        {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album" );
        return false;
    }

    public boolean addSong(String title, double duration)
    {
        return songList.addSong(title, duration);
    }

    private class SongList{
        private ArrayList<Song> songs;

        public SongList(){
            this.songs = new ArrayList<Song>();
        }

        private boolean addSong(String title, double duration)
        {
            if(findSong(title) == null)
            {
                this.songs.add(new Song(title, duration));
                return true;
            }

            return false;
        }

        private Song findSong(String title)
        {
            for(Song checkedSong: this.songs)
            {
                if(checkedSong.getTitle().equals(title))
                {
                    return checkedSong;
                }
            }
            return null;
        }

    }
}
