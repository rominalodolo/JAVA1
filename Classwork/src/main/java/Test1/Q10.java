/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

/**
 *
 * @author rominalodolo
 */
public class Q10 {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
        if (b2 != b1 = !b2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
