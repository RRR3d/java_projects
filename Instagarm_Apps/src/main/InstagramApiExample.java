package main;

import org.brunocvcunha.instagram4j.Instagram4j;
import org.brunocvcunha.instagram4j.requests.InstagramGetStoryViewersRequest;
import org.brunocvcunha.instagram4j.requests.InstagramGetUserFollowersRequest;
import org.brunocvcunha.instagram4j.requests.InstagramGetUserFollowingRequest;
import org.brunocvcunha.instagram4j.requests.InstagramSearchUsernameRequest;
import org.brunocvcunha.instagram4j.requests.payload.InstagramGetUserFollowersResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramSearchUsernameResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramStoryItem;
import org.brunocvcunha.instagram4j.requests.payload.InstagramUserSummary;

import java.io.IOException;
import java.util.List;

public class InstagramApiExample {
    public static void main(String[] args) throws IOException {
        // Authenticate with Instagram
        String username = "worldcupflagss";
        Instagram4j instagram = Instagram4j.builder().username(username).password("Allahakbr0").build();
        instagram.setup();
        instagram.login();



// Make the request to get the list of following and followers

        // Search for a specific Instagram user
        InstagramSearchUsernameRequest searchRequest = new InstagramSearchUsernameRequest("r_.3d");
        InstagramSearchUsernameResult searchResult = instagram.sendRequest(searchRequest);

        // GET FOLLOWING AND FOLLOWER NUMBER
        InstagramSearchUsernameResult userResult = instagram.sendRequest(new InstagramSearchUsernameRequest("r_.3d"));
        InstagramGetUserFollowersResult userFollowers = instagram
                .sendRequest(new InstagramGetUserFollowersRequest(userResult.getUser().getPk()));
        List<InstagramUserSummary> followers = userFollowers.getUsers();
        InstagramGetUserFollowersResult userFollowing = instagram
                .sendRequest(new InstagramGetUserFollowingRequest(userResult.getUser().getPk()));
        List<InstagramUserSummary> following = userFollowing.getUsers();

        String SearchUser = "worldcupflagss";
        InstagramSearchUsernameResult userRess = instagram.sendRequest(new InstagramSearchUsernameRequest(SearchUser));
        InstagramGetUserFollowersResult userFollowerss = instagram.sendRequest
                (new InstagramGetUserFollowersRequest(userRess.getUser().getPk()) );
        List<InstagramUserSummary> followerss = userFollowerss.getUsers();
        InstagramGetUserFollowersResult userFollowingg = instagram.sendRequest(new InstagramGetUserFollowingRequest
                (userRess.getUser().getPk()));
        List<InstagramUserSummary> followingg = userFollowingg.getUsers();


        System.out.println(followerss);
        System.out.println(followingg);

        // To check and see if numbers are correct
        System.out.println("Actual Follower Count " + userResult.getUser().getFollower_count());
        System.out.println("Reported Following Users " + following.size());
        System.out.println("Reported Followers " + followers.size());

        // Print information about the user
        System.out.println("Username: " + searchResult.getUser().getUsername());
        System.out.println("Full Name: " + searchResult.getUser().getFull_name());
        System.out.println("Profile Picture URL: " + searchResult.getUser().getProfile_pic_url());

        InstagramStoryItem storyItem = new InstagramStoryItem();
        InstagramGetStoryViewersRequest Story_viewrs = new InstagramGetStoryViewersRequest(storyItem.client_cache_key);
        String[] s = new String[storyItem.getViewer_count()];

        System.out.println(Story_viewrs);
    }
}
