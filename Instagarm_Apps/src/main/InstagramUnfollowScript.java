package main;

import org.brunocvcunha.instagram4j.Instagram4j;
import org.brunocvcunha.instagram4j.requests.InstagramGetUserFollowersRequest;
import org.brunocvcunha.instagram4j.requests.InstagramGetUserFollowingRequest;
import org.brunocvcunha.instagram4j.requests.InstagramUnfollowRequest;
import org.brunocvcunha.instagram4j.requests.payload.InstagramGetUserFollowersResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramUserSummary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;


public class InstagramUnfollowScript {
    private static final String USERNAME = "worldcupflagss";                       // Your username
    private static final String PASSWORD = "Allahakbr0";                       // Your password
    private static final long DELAY_TIME_MIN = 1000L;               // Minimal delay time between requests
    private static final long DELAY_TIME_MAX = 20000L;              // Maximal delay time between requests
    private static final int LONG_DELAY_FREQ = 10;                  // How often to add additional delay time
    private static final long LONG_DELAY_ADDED_TIME = 60000L;      // Additional delay time
    private  Scanner scanner = new Scanner(System.in);
    public void CreateNewLogins() throws Exception{
        System.out.println("Please enter your username: ");
        String Username1 = scanner.nextLine().strip();
        System.out.println("Please enter your password: ");
        String password1 = scanner.nextLine().strip();
        Instagram4j instagram2 = Instagram4j.builder().username(Username1).password(password1).build();
        instagram2.setup();

        try{
            instagram2.login();
        }catch(Exception e ){
            System.out.println(e + "THIS IS 2nd account ");
        }

        String Reproted_Account  = scanner.nextLine().strip();



    }
    public static void main(String[] args) throws InterruptedException, IOException {
        Instagram4j instagram = Instagram4j.builder()
                .username(USERNAME)
                .password(PASSWORD)
                .build();
        instagram.setup();


        try {
            instagram.login();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Get my followers
        long userId = instagram.getUserId();
        InstagramGetUserFollowersResult myFollowers;
        try {
            myFollowers = instagram.sendRequest(new InstagramGetUserFollowersRequest(userId));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        while (myFollowers.getNext_max_id() != null) {
            InstagramGetUserFollowersResult newRequest = instagram.sendRequest(new InstagramGetUserFollowersRequest(userId, myFollowers.getNext_max_id()));
            myFollowers.getUsers().addAll(newRequest.getUsers());
            myFollowers.setNext_max_id(newRequest.getNext_max_id());
        }

        // Get my following
        InstagramGetUserFollowersResult following;
        try {
            following = instagram.sendRequest(new InstagramGetUserFollowingRequest(userId));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Generate list of users who to unfollow
        List<InstagramUserSummary> toUnfollow = following.getUsers().stream()
                .filter(u -> {
                    boolean result = false;
                    for (InstagramUserSummary u2 : myFollowers.getUsers()) {
                        result = u.getPk() == u2.getPk();
                        if (result)
                            break;
                    }

                    return !result;
                })
                .collect(Collectors.toList());

        System.out.println("Followers: " + myFollowers.getUsers().size());
        System.out.println("Following: " + following.users.size());
        System.out.println("To unfollow: " + toUnfollow.size());

        Writer writer = new FileWriter("file.txt");
        BufferedWriter bf = new BufferedWriter(writer);
        bf.write(String.valueOf(toUnfollow));
        System.out.println(toUnfollow);

        // Do job
        Random random = new Random();
        int counter = 0;
        for (InstagramUserSummary u : toUnfollow) {
            System.out.println("Unfollowing  " + u.getUsername());

            instagram.sendRequest(new InstagramUnfollowRequest(u.getPk()));

            long sleepTime = DELAY_TIME_MIN * (1 + random.nextInt((int) (DELAY_TIME_MAX / DELAY_TIME_MIN)));
            if (counter++ % LONG_DELAY_FREQ == 0)
                sleepTime += LONG_DELAY_ADDED_TIME;
            System.out.println("Waiting for " + sleepTime + " ms");
            Thread.sleep(5000);
        }



}}
