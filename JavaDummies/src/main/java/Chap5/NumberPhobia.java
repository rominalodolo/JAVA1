/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap5;

import java.util.Scanner;

/**
 *
 * @author rominalodolo
 */
public class NumberPhobia {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 2;
        String input;
        while (true) {
            System.out.println(number + " ");
            System.out.print("Do you want to keep counting?"
                    + " (Y or N)");
            input = sc.next();
            if (input.equalsIgnoreCase("N")) {
                break;
            }
            number += 2;
        }
        System.out.println("\nWhew! That was close.\n");
    }
}

