package com.sspirescu;

import com.sspirescu.model.Artist;
import com.sspirescu.model.DataSource;
import com.sspirescu.model.SongArtist;

import javax.xml.crypto.Data;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        if(!dataSource.open()) {
            System.out.println("Failed to open data source... ");
            return;
        }

        List<Artist> artists = dataSource.queryArtists(DataSource.ORDER_BY_ASC);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID: " + artist.getId() +
                    ", Artist Name: " + artist.getName());
        }

        System.out.println("\n\n");

        List<String> albumsForArtists =
                dataSource.queryAlbumsForArtist("Carole King", DataSource.ORDER_BY_DESC);

        for (String alb : albumsForArtists) {
            System.out.println(alb);
        }

        List<SongArtist> songArtists = dataSource.queryArtistsForSong("Go Your Own Way", DataSource.ORDER_BY_ASC);

        if(songArtists == null) {
            System.out.println("Could not find the artists for the song.");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("Artist Name: " + artist.getArtistName() +
                    "  Album Name: " + artist.getAlbumName() +
                    "  Track: " + artist.getTrack());
        }

        dataSource.close();
    }
}
