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
public class CarWashApp2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The car wash application!\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        char p = s.charAt(0);
        String details = "";
        switch (p) {
            case 'E':
            case 'e':
                details = packageE() + packageD() + packageC()
                        + packageB() + packageA();
                break;
            case 'D':
            case 'd':
                details = packageD() + packageC()
                        + packageB() + packageA();
                break;
            case 'C':
            case 'c':
                details = packageC() + packageB()
                        + packageA();
                break;
            case 'B':
            case 'b':
                details = packageB() + packageA();
                break;
            case 'A':
            case 'a':
                details = packageA();
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }

    public static String packageA() {
        return "\tWash, vacuum, and hand dry.\n";
    }

    public static String packageB() {
        return "\tWax, plus ... \n";
    }

    public static String packageC() {
        return "\tLeather/Vinyl Treatment, plus ... \n";
    }

    public static String packageD() {
        return "\tTire Treatment, plus ... \n";
    }

    public static String packageE() {
        return "\tNew Car Scent, plus ... \n";
    }
}
