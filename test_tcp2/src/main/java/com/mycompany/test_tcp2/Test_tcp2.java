/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test_tcp2;

import java.util.Scanner;

/**
 *
 * @author Juan Manuel
 */
public class Test_tcp2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = in.nextLine();
        System.out.println("Type your last name:");
        String lastName = in.nextLine();
        System.out.println("Name: "+name+" LastName: "+lastName);
        
    }
}
