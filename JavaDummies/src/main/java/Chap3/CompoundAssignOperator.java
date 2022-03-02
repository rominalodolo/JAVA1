/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap3;

/**
 *
 * @author rominalodolo
 */
public class CompoundAssignOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        
        num1 += num2;
        System.out.println("New += Value: " + num1);
        
        num1 *= num2 ;
        System.out.println("New *= Value: " + num1);
    }
}
