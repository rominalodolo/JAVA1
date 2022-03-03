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

    public static void main(String[] args) {
        Thread clock = new CountDownClock();
//        clock.start();
        Runnable flood, ignition, liftoff;
        flood = new LaunchEvent(16, "Flood the pad!");
        ignition = new LaunchEvent(6, "Start engines!");
        liftoff = new LaunchEvent(0, "Liftoff!");
        clock.start();
        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start();
    }
}
