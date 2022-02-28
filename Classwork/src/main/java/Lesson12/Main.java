/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12;

/**
 *
 * @author rominalodolo
 */
public class Main {
    public static void main(String[] args) {
        Engineering engEmp01 = new Engineering(true, 6, "Johan", "Kirk", 92, "2 Sunningdale Close, Johannesburg", "Solutions Architect", 81000);
        HumanResource HREmp02 = new HumanResource(true, 2, "Dianne", "Honey", 40, "40 Bird Hill, Yale, Johannesburg", "Trainer", 26000);
        
        engEmp01.print();
        System.out.println("\n");
        HREmp02.print();
    }
    
}
