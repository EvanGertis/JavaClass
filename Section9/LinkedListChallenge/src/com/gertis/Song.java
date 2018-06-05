package com.gertis;

public class Song {

    private String name;
    private String artist;
    private String duration;

    public Song(String name, String artist, String duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }
}
