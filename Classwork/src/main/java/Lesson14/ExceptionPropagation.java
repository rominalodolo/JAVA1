/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14;

/**
 *
 * @author rominalodolo
 */
public class ExceptionPropagation {
    public void doThis() throws Exception{
        doThat();
    }
    public void doThat() throws Exception{
        int[] intArray = new int [5];
        intArray[5] = 27;
        System.out.println(intArray[5]);
    }
}
