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

    // creating a temporary file
    File tempFile = new File("tempFile.txt");

    // creating a writer object for the file
    FileWriter output = new FileWriter(tempFile);

    BufferedWriter writer = new BufferedWriter(output);

    // read the entire content of the file in one variable
    String content = new Scanner(new File(orgFile)).useDelimiter("\\Z").next();
    // split the text file using delimeter period
    String[] sentences = content.split("\\.");
    for(int i = 0; i < sentences.length; i++) {
        // write the sentence in the temporary file
        writer.write(sentences[i]);
        // write a new line
        writer.write("\n");
    }
// close the writer object
    writer.close();

// to copy the entire content into the original file
    OutputStream os = new FileOutputStream(orgFile);
    Files.copy(Paths.get("tempFile.txt"), os);
    // close the output stream object
    os.close();
    // delete the temporary file
    tempFile.delete();
}

}