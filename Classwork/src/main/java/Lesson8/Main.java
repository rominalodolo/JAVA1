/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8;

/**
 *
 * @author rominalodolo
 */
public class Main {

    public static void main(String[] args) {
        Customer cus1 = new Customer("Amanda", "Ally", 001, "01-09-1992", "AmandaAlly992@gmail.com");
        Customer cus2 = new Customer("Anne", "Gurdle", 002, "24-05-1991", "AnneGurdle91@hotmail.com");
        Customer cus3 = new Customer("Armand", "Skulk", 003, "12-12-1984", "SkulkArmand_55@gmail.com");

        Customer[] myCustomers = {cus1, cus2, cus3};

        for (Customer cus : myCustomers) {
            cus.cusDetails();
            System.out.println("\n");
        }
    }
}