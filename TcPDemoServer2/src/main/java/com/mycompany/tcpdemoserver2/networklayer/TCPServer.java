/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tcpdemoserver2.networklayer;

import com.mycompany.tcpdemoserver2.business.NamesManager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Manuel
 */
public class TCPServer {
    private int port;

    public TCPServer(int port) {
        this.port = port;
    }
    
    public void start(){
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server listing on port "+port);
            while(true){
                //Acept conection
                Socket clientSocket = serverSocket.accept();
                System.out.println("Conected from: "+clientSocket.getInetAddress());
                // Defining input and output
                DataInputStream inputStream= new DataInputStream(clientSocket.getInputStream());
                DataOutputStream outputStream= new DataOutputStream(clientSocket.getOutputStream());
                
                String clientMessage = inputStream.readUTF();
                clientMessage=clientMessage.trim();
                String[] parts = clientMessage.split(":");
                System.out.println("Client Message:  "+ clientMessage);
                NamesManager manager = new NamesManager();
                String response = manager.generateMessage(parts[0], parts[1]);
                System.out.println("Response: "+response);
                outputStream.writeUTF(response);
                clientSocket.close();
                System.out.println("Connection closed");
            }
        } catch (IOException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }
}
