/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise10a;

/**
 *
 * @author rominalodolo
 */
public class TeranyOperator {
    public static void main(String[] args) {
        int x = 4, y = 9;
        
        int result = ((y / x) < 3) ? (x += y) : (x *= y);
//        if ((y / x) < 3){
//            x += y;
//        }
//        else x *= y;
        System.out.println("Result: " + result);
    }
}

        
