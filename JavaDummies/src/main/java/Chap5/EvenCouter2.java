/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap5;

/**
 *
 * @author rominalodolo
 */
public class EvenCouter2 {

    public static void main(String[] args) {
        int number = 2;
        do {
            System.out.print(number + " ");
            number += 2;
        } while (number <= 20);
        System.out.println();
    }
}
