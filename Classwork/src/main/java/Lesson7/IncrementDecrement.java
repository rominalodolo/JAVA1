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
public class IncrementDecrement {
    public static void main(String[] args) {
        int count=15;
        int a, b, c, d;
        a = count++;
        b = count;
        c = ++count;
        d = count;
        System.out.println(a + ", " + b + ", " + c + ", " + d);
    }
}
