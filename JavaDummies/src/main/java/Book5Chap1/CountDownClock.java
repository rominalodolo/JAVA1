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
public class CountDownClock extends Thread	
{
    public void run()	
    {
        for (int t = 20; t >= 0; t--)	
        {
            System.out.println("T minus " + t);
            try
            {
                Thread.sleep(1000);	
            }
            catch (InterruptedException e)
            {}
        }
    }
}

