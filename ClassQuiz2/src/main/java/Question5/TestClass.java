/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author rominalodolo
 */
public class TestClass {
    public static void main(String[] args) {
        int i = 0;
        int[] iA = {10, 20};
        iA[i] = i = 30;
        System.out.println("" + iA[ 0 ] + " " iA[ 1 ] + "  " +i) ;
    }
}
