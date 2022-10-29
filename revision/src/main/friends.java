package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class friends {
    public static void main(String[] args) throws Exception{
        FileWriter write = new FileWriter(
                "/Users/abdo/Documents/GitHub/java_projects/revision/src/main/dima.txt");
        BufferedWriter writer = new BufferedWriter(write);
        ArrayList<String>  friends = new ArrayList<>();
        friends.add("Dima\n");
        friends.add("Damdom\n");
        friends.add("Cubcake\n");
        friends.add("Dimi\n");


        for(int i = 0 ; i <friends.size() ; i++){
                writer.write(friends.get(i));
            }
        writer.close();
        write.close();
        FileReader fileReader = new FileReader(
                "/Users/abdo/Documents/GitHub/java_projects/revision/src/main/dima.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line + ".");
        }
        reader.close();
        fileReader.close();
    }


}
