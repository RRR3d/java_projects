package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {

        new LoadingPage();
        WelcomePage wp = new WelcomePage();
        wp.START();

        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;

        try {
            serverSocket = new ServerSocket(1234);
            socket = serverSocket.accept();
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            Scanner scanner = new Scanner(System.in);

            while (true){
                String msgfromClient = bufferedReader.readLine();
                System.out.println(msgfromClient);
            }

        }catch (Exception e){}

        try {
            socket.close();
            bufferedReader.close();
            bufferedWriter.close();
            inputStreamReader.close();
            outputStreamWriter.close();
        }catch (Exception e){}
    }
}

