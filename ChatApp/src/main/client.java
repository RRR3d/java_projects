package main;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class client  {
    public static void main(String[] args)  throws  Exception{
        Socket socket = null;
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        ///
        BufferedWriter bufferedWriter1 = null;
        BufferedReader bufferedReader1 = null;
        InputStreamReader inputStreamReader1 = null;
        OutputStreamWriter outputStreamWriter1= null;
        ///
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter= null;

        try{
            socket = new Socket("localhost"  , 1177);
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            ///
          //  inputStreamReader1 = new InputStreamReader(socket.getInputStream());
            //outputStreamWriter1 = new OutputStreamWriter(socket.getOutputStream());
            bufferedReader1 = new BufferedReader(inputStreamReader);
            bufferedWriter1 = new BufferedWriter(outputStreamWriter);
            ///
            Scanner scanner = new Scanner(System.in);
            /**
             * String msgFromClient = bufferedReader.readLine();
             *                 System.out.println("client: " + msgFromClient);
             */
            while (true){
                ///
                String msgFromServer = bufferedReader1.readLine();
                System.out.println("Server: " + msgFromServer);
//                bufferedWriter1.write("Msg Recived!");
//                bufferedWriter1.newLine();
//                bufferedWriter1.flush();
                ///
                String msgToSend = scanner.nextLine();
                bufferedWriter.write(msgToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                System.out.println("Client 1: " + bufferedReader.readLine());
                if(msgToSend.equalsIgnoreCase("BYE"))
                    break;
            }
        }catch (Exception e){}

        finally {
            if(socket != null)
                socket.close();
            if(bufferedReader != null)
                bufferedReader.close();
            if(bufferedWriter != null)
                bufferedWriter.close();
            if(outputStreamWriter != null)
                outputStreamWriter.close();

        }
    }
}
