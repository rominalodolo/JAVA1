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
public class LaunchEvent implements Runnable
{
    private int start;
    private String message;
    public LaunchEvent(int start, String message)
    {
        this.start = start;
        this.message = message;
    }
    public void run()
    {
        try
        {
            Thread.sleep(20000 - (start * 1000));
        }
        catch (InterruptedException e)
        {}
        System.out.println(message);
    }
}
