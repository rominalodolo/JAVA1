/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author rominalodolo
 */
public class Arrays {

    public static void main(String[] args) {
        String[] names = {"Sammy", "Sally", "Sean"};
        int[] ages = new int[3];
        ages[0] = 35;
        ages[1] = 20;
        ages[2] = 27;
//      ages[3] = 34; out of bounds length exeption error 

        for (String name : names) {
            if (name == "Shelly") {
                System.out.println("We found " + name + ".");
                break;
            }
            else 
                System.out.println(name + ", ");
        }

        for (int age : ages) {
            System.out.println(age);
        }
    }
}
