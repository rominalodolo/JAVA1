/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book5Chap1;

/**
 *
 * @author rominalodolo
 */
public class CountDownApp {
    public static void main(String[] args)
    {
        Thread clock = new CountDownClock();
        clock.start();
    }
}
