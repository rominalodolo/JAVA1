/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap6;

import java.util.Scanner;

/**
 *
 * @author rominalodolo
 */
public class CarWashStringApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The car wash application\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        String details = "";
        switch (s.toUpperCase()) {
            case "PRESIDENTIAL":
                details += "\tNew Car Scent, plus ... \n";
            case "ELITE":
                details += "\tTire Treatment, plus ... \n";
            case "DELUXE":
                details += "\tLeather/Vinyl Treatment, plus ... \n";
            case "SUPER":
                details += "\tWax, plus ... \n";
            case "STANDARD":
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }
}
