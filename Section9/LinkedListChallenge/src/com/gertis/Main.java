package com.gertis;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to
        // Quit, Skip forward to the next song, skip backwards to a previous song. Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs
        // that you own_.
        // Hint: To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an option extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove())

        LinkedList<Song> songs = new LinkedList<Song>();

        Album testAlbum = new Album();
        testAlbum.addSong("Carolina","James Taylor","2.00", songs);
        testAlbum.addSong("Ramble On","Led Zepplin","4.00", songs);
        testAlbum.addSong("Gold on the Ceiling","Black keys","3.00", songs);

        testAlbum.printList(songs);

        printMenu();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean bSkippingForward = false;
        boolean bSkippingBackward = false;
        boolean bPlayingCurrent = false;
        ListIterator<Song> i = songs.listIterator();

        while (!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0:
                    System.out.println("quitting ");
                    quit = true;
                    break;

                case 1:
                    if(!i.hasNext())
                    {
                        System.out.println("End of playlist ");
                        break;
                    }
                    bSkippingForward = true;
                    bSkippingBackward = false;
                    System.out.println("Skipping.. ");
                    System.out.println("Playing : " +i.next().getName());
                    break;
                case 2:
                    if(!i.hasPrevious())
                    {
                        System.out.println("Beginning of playlist ");
                        break;
                    }
                    bSkippingForward = false;
                    bSkippingBackward = true;
                    System.out.println("Playing previous.. ");
                    System.out.println("Playing : " +i.previous().getName());
                    break;
                case 3:
                    if(i.hasPrevious())
                    {
                        bPlayingCurrent = true;
                        System.out.println("Playing previous.. ");
                        System.out.println("Playing : " + i.previous().getName());
                        i.next();
                        break;
                    }
                case 4:
                    System.out.println("Removing current song.. ");
                    i.remove();

                    break;
            }
        }
    }

    private static void printMenu()
    {
        System.out.println("Available actions:\n press ");
        System.out.println(" 0 - to quit\n" +
                " 1 - skip song\n" +
                " 2 - play previous song\n" +
                " 3 - replay current song" +
                " 4 - remove current song");
    }
}
