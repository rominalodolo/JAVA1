/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAppExercise;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author rominalodolo
 */
public class UserAccount {
    
    static Scanner sc = new Scanner(System.in);
    static NumberFormat cf = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        
        String UserInput = ("Y") ("N");
        int start = 1000;
        int withdrawl = UserWithdrawlAmount;
        int add = UserAddAmount;
        int totalFunds = ( start - withdrawl ) | ( start + add );

        System.out.println("You currently have " + start + " in your account.");
        
        
        if (add.equalsIgnoreCase("y")) { 
        System.out.println("Do you wish to add funds? Y/n");
        String add = sc.next();
        
        
        System.out.println("How much would you like to deposit?");
        else {
                
                }
        
        System.out.println("Do you wish to withdraw funds? Y/n");
        
        
        System.out.println("How much would you like to withdraw?");
        
        
        System.out.println("Thank you for banking with us, Have a lovely day!");
        
        
        System.out.println("Total in " + UserAccount + ": " + cf.format(totalFunds) );
    }
}
