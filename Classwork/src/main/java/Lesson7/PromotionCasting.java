/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

/**
 *
 * @author rominalodolo
 */
public class PromotionCasting {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 2;
//        double num2 = 2;
        double num3;
        num3 = num1 / num2;
        
        System.out.println("Result: " + num3);
        System.out.println("\n");
        
//        Automatic promotion that needs to be cast down
        short a, b, c;
        a = 12;
        b = 15;
        c = (short)(a + b);
//        c = a + b;
// error         
        System.out.println("Casting Result: " + c);
    }
}
