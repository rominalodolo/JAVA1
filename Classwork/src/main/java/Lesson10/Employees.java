/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10;

/**
 *
 * @author rominalodolo
 */
public class Employees {
    
    public String name1 = new String("Fred Smith");
    public String name2 = new String("Fred Smith");
    
    public void areNamesEqual() {
        if (name1 == name2) {
            System.out.println("Same same.");
        }
        else {
            System.out.println("Different name.");
        }
    }
}
