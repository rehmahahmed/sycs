// Server
package com.mycompany.practs;
import java.io.*;
import java.net.*;
public class Prac8Server {
    public static void main(String args[]) throws IOException{
        Socket socket;
        ServerSocket serversocket = new ServerSocket(8080);
        java.io.InputStreamReader insr = null;
        java.io.OutputStreamWriter oswr = null;
        java.io.BufferedReader br = null;
        java.io.BufferedWriter bw = null;
        while(true){
            try{
                socket = serversocket.accept();
                insr = new InputStreamReader(socket.getInputStream());
                oswr = new OutputStreamWriter(socket.getOutputStream());
                br = new BufferedReader(insr);
                bw = new BufferedWriter(oswr);
                while(true){
                    String msgfromclient = br.readLine();
                    System.out.println(msgfromclient);
                    bw.write("Message Received");
                    bw.newLine();
                    bw.flush();
                    if(msgfromclient.equalsIgnoreCase("BYE")){
                        break;
                    }
                }
            }catch(Exception e){
                System.out.println("Error: " + e);
            }
        }
    }

}
