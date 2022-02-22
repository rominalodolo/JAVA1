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
public class Example1 {

    public static void main(String[] args) {
        String greet = " HOW ".trim();
        String result1 = greet + "DY".toLowerCase();
        String result2 = (greet + "DY").toLowerCase();

        System.out.println(result1);
        System.out.println(result2);
        
        System.out.println("\n");
        
        String phoneNum = "404-567-9107";
        int idx1 = phoneNum.indexOf('-');
        System.out.println("index of first dash: " + idx1);
        
        int idx2 = phoneNum.indexOf('-', idx1+1);
        System.out.println("second dash idx: "+idx2);
        
    }
}
