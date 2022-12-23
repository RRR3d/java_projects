package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args)  throws  Exception{


        Loading loading = new Loading();
        Thread th2 = new Thread(loading);
        th2.start();

        userspasswords usersPasswords = new userspasswords();
        LoginPage loginPage = new LoginPage(usersPasswords.getLoginInfo());
        Thread th1 = new Thread(loginPage);
        th1.start();


        InputStreamReader inputStreamReader =  null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        InputStreamReader inputStreamReader1 =  null;
        OutputStreamWriter outputStreamWriter1 = null;
        BufferedReader bufferedReader1 = null;
        BufferedWriter bufferedWriter1 = null;

        System.out.println("Booting Server up...");
        ServerSocket serverSocket  = new ServerSocket(1177);
        System.out.println("Server is ready!");
        Socket socket = null;
        while (true){

            socket= serverSocket.accept();
            System.out.println("A client has entered..");
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedReader1 = new BufferedReader(inputStreamReader);
            bufferedWriter1 = new BufferedWriter(outputStreamWriter);
            /**
             * String msgToSend = scanner.nextLine();
             *                 bufferedWriter.write(msgToSend);
             *                 bufferedWriter.newLine();
             *                 bufferedWriter.flush();
             *
             *                 System.out.println("Client 1: " + bufferedReader.readLine());
             */
            Scanner scanner = new Scanner(System.in);
            for(;;){

                ///
                String msgToSend = scanner.nextLine();
                bufferedWriter1.write(msgToSend);
                bufferedWriter1.newLine();
                bufferedWriter1.flush();
                System.out.println("Client " + bufferedReader1.readLine());
                ///

                String msgFromClient = bufferedReader.readLine();
                System.out.println("client: " + msgFromClient);
                //bufferedWriter.write("Msg Recived!");
                //bufferedWriter.newLine();
               // bufferedWriter.flush();
                if(msgFromClient.equalsIgnoreCase("BYE"))
                    break;

            }
            socket.close();
            inputStreamReader.close();
            bufferedReader.close();
            bufferedWriter.close();
            outputStreamWriter.close();

        }


    }
}
