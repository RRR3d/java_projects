package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstagramFollowerCount {
    public static void main(String[] args) throws IOException {
        // Replace "instagramUsername" with the actual username of the Instagram account
        String url = "https://www.instagram.com/r_.3d/";

        // Open a connection to the URL and retrieve the page contents
        URL instagram = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(instagram.openStream()));

        // Search the page for the "followed_by" section, which contains the follower count
        String inputLine;
        Pattern p = Pattern.compile("followed_by\":\"count\":(\\d+)");
        while ((inputLine = in.readLine()) != null) {
            Matcher m = p.matcher(inputLine);
            if (m.find()) {
                // Print the follower count to the console
                System.out.println("This account has " + m.group(1) + " followers.");
                break;
            }
        }

        in.close();
    }
}
