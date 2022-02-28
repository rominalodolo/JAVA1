/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

import java.util.ArrayList;

/**
 *
 * @author rominalodolo
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names;
        names = new ArrayList();
        
        names.add("Jamie");
        names.add("Sally");
        names.add("Romina");
        names.add("Rose");
        names.add(2, "Kyle");
        
        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Wally");
        
        System.out.println(names);
    }
}
