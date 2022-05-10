package com.sspirescu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) {

        try {

            URL url = new URL("http://example.org");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();

//            URI uri = url.toURI();

            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream())
            );

            String line = "";
            while (line != null)
            {
                line = inputStream.readLine();
                System.out.println(line);
            }

            inputStream.close();

//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme specific part = " + uri.getSchemeSpecificPart());
//            System.out.println("Authority = " + uri.getAuthority());
//            System.out.println("User Info = " +uri.getUserInfo());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port = " + uri.getPort());
//            System.out.println("Path = " + uri.getPath());
//            System.out.println("Query = " + uri.getQuery());
//            System.out.println("Fragment = " + uri.getFragment());


//            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");

//            URI baseUri = new URI("http://username:password@mynewserver.com:5000");
//            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
//            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
//            URI uri3 = new URI("/stores/locations/zip=12345");
//
//            URI resolvedUri1 = baseUri.resolve(uri1);
//            URI resolvedUri2 = baseUri.resolve(uri2);
//            URI resolvedUri3 = baseUri.resolve(uri3);
//
//            URI relativizedUri = baseUri.relativize(resolvedUri2);
//            System.out.println("Relative URI = " + relativizedUri);
//
//            URL url1 = resolvedUri1.toURL();
//            System.out.println("URL 1 = " + url1);
//            URL url2 = resolvedUri2.toURL();
//            System.out.println("URL 2 = " + url2);
//            URL url3 = resolvedUri3.toURL();
//            System.out.println("URL 3 = " + url3);

        } catch (MalformedURLException e) {
            System.out.println("Malformed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());

        }
    }
}
