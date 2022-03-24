package com.sspirescu;

import com.sspirescu.model.Artist;
import com.sspirescu.model.DataSource;

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





        dataSource.close();
    }
}
