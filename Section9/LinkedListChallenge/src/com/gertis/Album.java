package com.gertis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

    public void  addSong(String name, String artist, String duration, LinkedList<Song> songs)
    {
        Song song = new Song(name, artist, duration);

        ListIterator<Song> songListIterator = songs.listIterator();

        while(songListIterator.hasNext())
        {
            int comparisionArtist = songListIterator.next().getArtist().compareTo(artist);
            int comparisionName = songListIterator.previous().getName().compareTo(name);
            int comparisionDuration = songListIterator.next().getDuration().compareTo(duration);

            if((comparisionArtist == 0 || comparisionName == 0) && comparisionDuration == 0)
            {
                System.out.println("Artist already included");
                return;
            }
        }

        songListIterator.add(song);
    }

    public void printList(LinkedList<Song> linkedList)
    {
        System.out.println("Playlist : ");
        for(int i = 0; i < linkedList.size(); i++)
        {
            System.out.println("Name : " + linkedList.get(i).getName() +  " Artist : " + linkedList.get(i).getArtist() + " Duration : " + linkedList.get(i).getDuration());
        }
    }


}
