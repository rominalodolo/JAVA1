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
public class Pants extends Clothing implements Returnabale {
    
    @Override
    public void doReturn(){
        System.out.println("You may return within a week of purchase date.");
    }
}
