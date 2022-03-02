/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author rominalodolo
 */
public class OverloadingTest {
    
    void ml(int x){
        System.out.println("ml int");
    }
    
    void ml(double x){
        System.out.println("ml double");
    }
    void ml (String x){
        System.out.println("ml String");
    }
}

public class TestClass {
    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        ot.ml(1.0);
    }
}

//What will be the output? 
//a. It will fail to compile. 
//b. m1 int 
//c. m1 double 
//d. m1 String

