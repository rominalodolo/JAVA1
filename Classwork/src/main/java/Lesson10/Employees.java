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
    
    public String name1 = "Fred Smith";
    public String name2 = "Sam Smith";
    
    public void areNamesEqual() {
        if (name1.equals(name2)) {
            System.out.println("Same same.");
        }
        else {
            System.out.println("Different name.");
        }
    }
}
