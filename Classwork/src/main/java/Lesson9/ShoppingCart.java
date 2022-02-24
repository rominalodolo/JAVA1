/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9;

/**
 *
 * @author rominalodolo
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt(12, "Floral", 'B', 12.87);
        Shirt shirt02 = new Shirt(8, "Checkered", 'R');
        Shirt shirt03 = new Shirt("Animal", 'Y', 13.18);
        shirt01.setColorCode('V');
        
        System.out.println(shirt01.print());
        System.out.println(shirt02.print());
        System.out.println(shirt03.print());
    }
}
