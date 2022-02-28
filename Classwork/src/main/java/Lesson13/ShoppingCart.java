/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

/**
 *
 * @author rominalodolo
 */
public class ShoppingCart {

    public static void main(String[] args) {
        Dress dressCart01 = new Dress("Long", "Boho, yellow", "Maxi Dress", "A yellow floor length, maxi-boho dress.", 24, "Cotton", 300, 150, 'S');
        Clothing skirtCart02 = new Skirts("Pleated", 30, "Pleated Skirt", "A plaid And flannel pleated skirt.", 21, "Cotton", 349, 180, 'M');
        Shoes shoesCart03 = new Shoes(7, "Leather Strapping.", "Formal dark leather shoe.", "Leather work shoe", 15, "Leather", 1299, 699, 'M');

        dressCart01.print();
        System.out.println("\n");
        if (skirtCart02 instanceof Skirts){
            System.out.println("Waist Size: " + ((Skirts)skirtCart02).getWaistSize());
        }
        System.out.println("\n");
        shoesCart03.print();
    }
}
