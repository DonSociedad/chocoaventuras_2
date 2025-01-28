/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tcpdemoserver2;

import com.mycompany.tcpdemoserver2.networklayer.TCPServer;

/**
 *
 * @author Juan Manuel
 */
public class TcPDemoServer2 {

    public static void main(String[] args) {
        TCPServer server = new TCPServer(9090);
        server.start();
    }
}
