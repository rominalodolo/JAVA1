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
public class GetABet2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 1000; // assume the user has $1,000
        int bet; // the bet entered by the user
        System.out.println("You can bet between 1 and " + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
            if ((bet <= 0) || (bet > bank)) {
                System.out.println("What, are you crazy?");
            }
        } while ((bet <= 0) || (bet > bank));
        System.out.println("Your money's good here.");
    }
}
