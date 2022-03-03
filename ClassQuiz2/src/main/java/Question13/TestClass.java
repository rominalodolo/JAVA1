/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question13;

/**
 *
 * @author rominalodolo
 */
public class TestClass {
    void probe(Integer x){System.out.println("In Integer");}
    
    void probe(Object x) {System.out.println("In Object");}
    
    void probe(Long x) { System.out.println("In Long");}
    public static void main(String[] args) {
        String a = "hello";
        new TestClass().probe(a);
    }
}
