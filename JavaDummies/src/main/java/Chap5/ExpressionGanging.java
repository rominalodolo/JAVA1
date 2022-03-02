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
public class ExpressionGanging {

    public static void main(String[] args) {
        System.out.print("We are go for launch in T minus ");
        for (int count = 10; count >= 0;
                System.out.println((count == 8)
                        ? "Ignition sequence start!"
                        : count + "..."), count--);
        System.out.println("All engines running!");
        System.out.println("Liftoff! We have a liftoff!");
    }
}
