package com.sspirescu;

import com.sspirescu.model.DataSource;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        if(!dataSource.open()) {
            System.out.println("Failed to open data source... ");
            return;
        }

        dataSource.close();
    }
}
