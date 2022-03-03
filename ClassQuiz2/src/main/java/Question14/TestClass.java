/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question14;

/**
 *
 * @author rominalodolo
 */
public class TestClass {

    public static void main(String[] args) {
        int k = 0;
        int m = 0;
        for (int i = 0; i <= 3; i++) {
            k++;
            if (i == 2) {
                i = 4;
            }
            m++;
        }
        System.out.println(k + ", " + m);
    }
}
