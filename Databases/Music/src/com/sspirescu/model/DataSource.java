package com.sspirescu.model;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\SS-PC\\Ciorne\\JavaCoursework\\Databases\\Music\\" + DB_NAME;

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Cannot connect to DataBase: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Cannot close connection: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Artist> queryArtists() {
//        Statement statement = null;
//        ResultSet results = null;

        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS)) {

            List<Artist> artists = new ArrayList<>();
            while(results.next()) {
                Artist artist = new Artist();
                artist.setId(results.getInt(COLUMN_ARTIST_ID));
                artist.setName(results.getString(COLUMN_ARTIST_NAME));
                artists.add(artist);
            }

            return artists;

        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
//        finally {
//            try {
//                if(results != null) {
//                    results.close();
//                }
//            } catch (SQLException e) {
//                e.getMessage();
//            }
//
//
//            try {
//                if (statement != null) {
//                    statement.close();
//                }
//            } catch (SQLException e) {
//                e.getMessage();
//            }
//        }
    }
}













