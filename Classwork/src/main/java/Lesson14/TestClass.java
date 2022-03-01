/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14;

import java.io.File;

/**
 *
 * @author rominalodolo
 */
public class TestClass {
    public void testCheckedException() throws Exception{
        File testFile = new File("testFile.txt");
        testFile.createNewFile();
            System.out.println("testFile exists: " + testFile.exists());
    }
}
