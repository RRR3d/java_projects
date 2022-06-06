package main;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

public class Q5 {public static void main(String[] args) throws IOException {
    // take the file input name using scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter File Name: ");
    String orgFile = scan.nextLine();

    // TEMP FILE
    File tempFile = new File("tempFile.txt");


    FileWriter fileWriter = new FileWriter(tempFile);

    BufferedWriter writer = new BufferedWriter(fileWriter);

    // GET ALL THE DATA OF THE FILE IN ONE STRING
    String content = new Scanner(new File(orgFile)).useDelimiter("\\Z").next();

    // MAKE AN ARRAY OF STRINGS FOR EVERY SENTENCE
    String[] sentences = content.split("\\.");

    for(int i = 0; i < sentences.length; i++) {
        // write the sentence in the temporary file
        writer.write(sentences[i]);
        // write a new line
        writer.write("\n");
    }

    writer.close();

// to copy the entire content into the original file
    OutputStream outputStream = new FileOutputStream(orgFile);
    Files.copy(Paths.get("tempFile.txt"), outputStream);
    // close the fileWriter stream object
    outputStream.close();
    // delete the temporary file
    tempFile.delete();
}

}